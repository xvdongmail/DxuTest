import com.demos.pdf.PDFUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class BjElectronicTemp extends PDFTestInterface{
    Logger logger = LoggerFactory.getLogger(BjElectronicTemp.class);

    @Test
    public void testMergePdfSy() {
        logger.info("测试");
        String inPath = "E:\\Temp\\pdf\\in\\商业险电子保单模板.pdf";
        String outPath = "E:\\Temp\\pdf\\out\\商业险电子保单模板" + (new Date().getTime()) + ".pdf";
        Map<String, String> data = defaultData;
        PDFUtils.mergePdf(inPath, data, outPath);
    }
}
