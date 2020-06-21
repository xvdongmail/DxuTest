package com.demos.pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.*;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PDFUtils {
    static Logger logger= LoggerFactory.getLogger(PDFUtils.class);

    /**
     * 填充PDF模板
     * @param templateFilePath
     * @param data
     */
    public static void mergePdf(String templateFilePath, Map<String, String> data,String outFilePath){
        PdfReader reader;
        FileOutputStream out;
        ByteArrayOutputStream bos;
        PdfStamper stamper;
        try {
            out = new FileOutputStream(outFilePath);// 输出流
            reader = new PdfReader(templateFilePath);// 读取pdf模板
            bos = new ByteArrayOutputStream();
            stamper = new PdfStamper(reader, bos);
            AcroFields form = stamper.getAcroFields();

            // 给表单添加中文字体 这里采用系统字体。不设置的话，中文可能无法显示
            BaseFont bf = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);

			/*BaseFont bf = BaseFont.createFont(UtilPath.getRootPath() + "fonts/simsun.ttc,0", BaseFont.IDENTITY_H,
					BaseFont.EMBEDDED);*/
            form.addSubstitutionFont(bf);

            //遍历map装入数据
            List<String> exclude= Arrays.asList("QR_CODE".split(","));
            for (Map.Entry<String, String> entry : data.entrySet()) {
                if(exclude.contains(entry.getKey())) continue;
                form.setField("${"+entry.getKey()+"}", entry.getValue());
            }
            //设置二维码BEGIN
            String qrCodeName="QR_CODE";
            List<AcroFields.FieldPosition> list= form.getFieldPositions("${"+qrCodeName+"}");
            if(list!=null&&list.size()>0){
                int pageNo = list.get(0).page;
                Rectangle signRect = list.get(0).position;
                float x = signRect.getLeft();
                float y = signRect.getBottom();
                // 读图片
                Image image = Image.getInstance(data.get(qrCodeName));
                // 获取操作的页面
                PdfContentByte under = stamper.getOverContent(pageNo);
                // 根据域的大小缩放图片
                image.scaleToFit(signRect.getWidth(), signRect.getHeight());
                // 添加图片
                image.setAbsolutePosition(x, y);
                under.addImage(image);
            }
            //设置二维码 END
            stamper.setFormFlattening(true);// 如果为false那么生成的PDF文件还能编辑，一定要设为true
            stamper.close();


            Document doc = new Document();
            PdfCopy copy = new PdfCopy(doc, out);
            doc.open();
            PdfImportedPage importPage = copy.getImportedPage(new PdfReader(bos.toByteArray()), 1);
            copy.addPage(importPage);
            doc.close();
            FileUtils.writeByteArrayToFile(new File(outFilePath),bos.toByteArray());
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("PDF模版填充失败",e);
        }
    }
}
