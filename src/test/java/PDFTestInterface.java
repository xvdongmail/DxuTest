import org.junit.After;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class PDFTestInterface {
    Logger logger = LoggerFactory.getLogger(PDFTestInterface.class);
    Map<String, String> defaultData = new HashMap<String, String>();
    @After
    public  void clearData(){
        logger.info("清空通用参数");
        defaultData = new HashMap<String, String>();
    }
    /**
     *
     * @return
     */
    @Before
    public void getMergePdfSyData() {
        logger.info("设置通用参数");
        Map<String, String> data = new HashMap<String, String>();
        data.put("POLICY_NO", "1234567890abcdefgh");
        data.put("CAR_MARK", "京A12345");
        data.put("START_DATE", "2016年12月9日0时0分");
        data.put("END_DATE", "2017年12月8日23时59分");
        data.put("COMPANY_NAME", "富德财产保险股份有限公司北京分公司");
        data.put("SERVICETELEPHONENUMBER", "1234567890");
        data.put("RECEIPTCONFIRMATIONTIME", "2016-12-0909:12:00");
        data.put("CONFIRM_TIME", "2016-12-0909:12:00");
        data.put("ELECTRONICPOLICYCREATIONDATE", "2016-12-0909:12:00");
        data.put("POLICY_NO", "1234567890abcdefgh");
        data.put("INSURED_NAME", "张三");
        data.put("INSURED_CERTI_TYPE", "居民身份证");
        data.put("INSURED_CERTI_CODE", "1234567890abcd****");
        data.put("INSURED_MAIL_ADDRESS", "北京市石景山区实兴大街30号****");
        data.put("INSURED_TELEPHONE", "123****8901");
        data.put("INSURED_EMAIL", "zhangsan@163.com");
        data.put("POLICY_HOLDER", "李四");
        data.put("POLICY_CERTI_TYPE", "居民身份证");
        data.put("POLICY_CERTI_CODE", "1234567890abcdefgh");
        data.put("POLICY_MAIL_ADDRESS", "北京市石景山区实兴大街30号院1号楼");
        data.put("POLICY_EMAIL", "lisi@163.com");
        data.put("POLICY_TELEPHONE", "1234567890");
        data.put("CAR_MARK", "京A12345");
        data.put("VEHICLE_CATEGORY", "六座以下客车");
        data.put("USE_TYPE", "营业");
        data.put("ENGINE_NO", "123456");
        data.put("RACK_NO", "ABCDEFG1234567890");
        data.put("VEHICLE_MODEL", "捷达FV7160FG");
        data.put("LIMIT_LOAD_PERSON", "5");
        data.put("LIMIT_LOAD", "1000千克");
        data.put("USE_AGES", "2");
        data.put("EXHAUST_CAPACITY", "1000毫升");
        data.put("POWER", "122KW");
        data.put("REGISTER_DATE", "2016-12-09");
        data.put("RATIO", "-30");
        data.put("ACTUAL_PREMIUM", "870.72");
        data.put("ACTUAL_PREMIUM-Max", "捌佰柒拾元柒角贰分");
        data.put("FUND_AMOUNT", "8.71");
        data.put("FUNDRATIO", "1.1");
        data.put("START_DATE", "2016年12月9日0时0分");
        data.put("END_DATE", "2017年12月8日23时59分");
        data.put("CONTRACTDISPUTE_RESOLUTION", "诉讼");
        data.put("RVEHICLE_WEIGHT", "1200千克");
        data.put("TAX_PAYER_IDENTIFICATION_CODE", "23011919820622200");
        data.put("CURRENT_TAX", "32.72");
        data.put("FORMER_TAX", "32.72");
        data.put("LATE_FEE", "32.72");
        data.put("TAX_TOTAL", "32.72");
        data.put("TAX_TOTAL-Max", "叁拾贰元柒角贰分");
        data.put("PAY_NO", "B00924551881");
        data.put("DEPARTMENT", "浙江省");
        data.put("ASSUMPTION", "XXXXXXX\rXXXXXX");
        data.put("IMPORTANT_NOTICE", "XXXXXXX\rXXXXXX");
        data.put("CONFIRM_SEQUENCE_NO", "02CATH02160000000000952875836A");
        data.put("COMPANY_NAME", "富德财产保险股份有限公司北京分公司");
        data.put("COMPANY_ADDRESS", "北京市石景山区实兴大街30号院1号楼");
        data.put("COMPANY_ZIPCODE", "100010");
        data.put("SERVICE_TELEPHONENUMBER", "1234567890");
        data.put("BILL_DATE", "2016-12-09");
        data.put("UNDERWRITING_NAME", "张三");
        data.put("DOCUMENTATION", "赵六");
        data.put("AGENT", "李四");
        data.put("INDIVIDUALPRODUCERNAME", "本保单为中介业务，中介机构名称为航联保险经纪公司");
        data.put("OWNER_NAME", "行驶证车主王五车主");
        data.put("OWNER_CERTI_TYPE", "居民身份证");
        data.put("OWNER_CERTI_CODE", "1234567890abcdefgh");
        data.put("OWNER_MAIL_ADDRESS", "北京市石景山区实兴大街30号院1号楼");
        data.put("OWNER_ZIP", "100000");
        data.put("OWNER_TELEPHONE", "1234567890");
        data.put("AVERAGE_MILE", "100.50");
        data.put("TRAVELAREA", "省内");
        data.put("COMPLAINTTELEPHONENUMBER", "95510");
        data.put("WEBSITE", "http://pc.ehuatai.com/");
        data.put("AGRNT_PHONE", "1234567890");
        data.put("AGRNT_ADDRESS", "北京市石景山区实兴大街30号院1号楼");
        data.put("POS_NO", "2423421421423");
        data.put("SERIAL_NO", "AB12345AB12345AB12345AB12345");
        data.put("DISCOUNT_AMOUNT", "870.72");
        data.put("REPORT_PHONE_NO", "95510");
        data.put("LINKER_NAME", "李四");
        data.put("PHONE_NO", "13910202022");
        data.put("INSUREDPOLICY_RECEIPT_CONFIRMA_TIONTIME", "2016-12-09 09:12:00");
        data.put("INSUREDPOLICY_ELECTRONIC_POLICY_CREATION_DATE", "2016-12-09 09:12:00");
        data.put("INSUREDPOLICY_NO", "1234567890abcdefgh");
        data.put("INSUREDPOLICY_ACTUAL_PREMIUM", "870.72");
        data.put("INSUREDPOLICY_ACTUAL_PREMIUM-Max", "捌佰柒拾元柒角贰分");
        data.put("INSUREDPOLICY_START_DATE", "2016年12月9日0时0分");
        data.put("INSUREDPOLICY_END_DATE", "2017年12月8日23时59分");
        data.put("INSUREDPOLICY_CONTRACT_DISPUTE_RESOLUTION", "诉讼");
        data.put("INSUREDPOLICY_ASSUMPTION", "特别约定XXXXXXX\rXXXXXX特别约定，特别约定，特别约定，特别约定，特别约定，特别约定，特别约定，特别约定，特别约定，\t\n定，特别约定，特别约定，特别约定，特别约定，特别约定，特别约定，\t\n定，特别约定，特别约定，特别约定，特别约定，特别约定，特别约定，\t\n定，特别约定，特别约定，特别约定，特别约定，特别约定，特别约定，");
        data.put("INSUREDPOLICY_IMPORTANT_NOTICE", "重要提示XXXXXXX\rXXXXXX,重要提示，重要提示，重要提示，重要提示，重要提示，重要提示，");
        data.put("INSUREDPOLICY_UNDERWRITI_NGNAME", "张三");
        data.put("INSUREDPOLICY_DOCUMENTATION", "赵六");
        data.put("INSUREDPOLICY_AGENT", "李四");
        data.put("INSUREDPOLICY_POLICY_INSURE_CODE", "02CATH02160000000000952875836A");
        data.put("INSUREDPOLICY_CONFIRM_TIME", "2016-12-0909:12:00");
        data.put("INSUREDPOLICY_INDIVIDUALPRODUCERNAME", "本保单为中介业务，中介机构名称为航联保险经纪公司");
        data.put("INSUREDPOLICY_TRAVELROUTE", "从汽车制造厂到汽车专卖店");
        data.put("INSURED_NAME", "张三");
        data.put("INSURED_CERTI_TYPE", "居民身份证");
        data.put("INSURED_CERTI_CODE", "1234567890abcd****");
        data.put("INSURED_MAIL_ADDRESS", "北京市石景山区实兴大街30号****");
        data.put("INSURED_TELEPHONE", "123****8901");
        data.put("INSURED_EMAIL", "zhangsan@163.com");
        data.put("POLICY_HOLDER", "李四");
        data.put("POLICY_CERTI_TYPE", "居民身份证");
        data.put("POLICY_CERTI_CODE", "1234567890abcdefgh");
        data.put("POLICY_MAIL_ADDRESS", "北京市石景山区实兴大街30号院1号楼");
        data.put("POLICY_EMAIL", "lisi@163.com");
        data.put("POLICY_TELEPHONE", "1234567890");
        data.put("OWNER_NAME", "行驶证车主王五车主");
        data.put("OWNER_CERTI_TYPE", "居民身份证");
        data.put("OWNER_CERTI_CODE", "1234567890abcdefgh");
        data.put("OWNER_MAIL_ADDRESS", "北京市石景山区实兴大街30号院1号楼");
        data.put("OWNER_ZIP", "100000");
        data.put("OWNER_TELEPHONE", "1234567890");
        data.put("CAR_MARK", "京A12345");
        data.put("CAR_VEHI_CLECATEGORY", "六座以下客车");
        data.put("CAR_ENGI_NENO", "123456");
        data.put("CAR_RACK_NO", "ABCDEFG1234567890");
        data.put("CAR_VEHICLE_MODEL", "捷达FV7160FG");
        data.put("CAR_LIMIT_LOAD_PERSON", "5");
        data.put("CAR_LIMIT_LOAD", "1000千克");
        data.put("CAR_USE_AGES", "2");
        data.put("CAR_REGISTER_DATE", "2016-12-09");
        data.put("CAR_AVERAGE_MILE", "100.50");
        data.put("CAR_USE_TYPE", "营业");
        data.put("CAR_TRAVEL_AREA", "省内");
        data.put("CAR_EXHAUST_CAPACITY", "1000毫升");
        data.put("CAR_POWER", "122KW");
        data.put("CAR_COLOR", "白");
        data.put("CAR_DEPRECIATIONRATE", "0.10");
        data.put("CAR_VEHICLEORIGIN", "国产");
        data.put("COMPANY_NAME", "富德财产保险股份有限公司北京分公司");
        data.put("COMPANY_ADDRESS", "北京市石景山区实兴大街30号院1号楼");
        data.put("COMPANY_ZIP_CODE", "100010");
        data.put("COMPANY_SERVICE_TELEPHONENUMBER", "1234567890");
        data.put("COMPANY_WEBSITE", "http://pc.ehuatai.com/");
        data.put("COMPANY_TELEPHONENUMBER", "95510");
        data.put("BILL_DATE", "2016-12-09");

        List<String>  cvrgs=Arrays.asList("车上货物责任险,发动机涉水损失险（机动车）,附加绝对免赔率特约险,车身划痕损失险（机动车）,附加车轮单独损坏除外特约险,第三者责任险法定节假日限额翻倍险,新增加设备损失险,第三者责任保险,指定修理厂险,车上人员责任保险（驾驶人）,车辆损失保险无法找到第三方特约险,车上人员责任保险（乘客）,精神损害抚慰金损失险,车辆损失保险,玻璃单独破碎险,自燃损失险,全面型车辆损失险,全车盗抢保险,不计免赔".split(","));
        for(int i=0;i<cvrgs.size();i++){
            data.put("MAIN_COVERAGE_CODE-"+i, cvrgs.get(i));
            data.put("MAIN_ISNONDEDUCTIBLE-"+i,  i+"否");
            if(i>5) {
                data.put("MAIN_LIMIT_AMOUNT-" + i, i + "车上货物责任险,发动机涉水损失险（机动车）,附加绝对免赔率特约险,车身划痕损失险（机动车）");
            }else{
                data.put("MAIN_LIMIT_AMOUNT-" + i, i + "12321");
            }
            data.put("MAIN_TOTAL_ADJUST-"+i, i+".25%");
            data.put("MAIN_BASED_PREMIUM-"+i, i+"8.72");
            data.put("MAIN_ACTUAL_PREMIUM-"+i, i+"8.72");
            data.put("MAIN_DEDUCTIBLE-"+i, i+"5");
            data.put("MAIN_PREMIUM_BALANCE-"+i, i+"87.72");
            data.put("MAIN_PREMIUM_NDPREMIUM-"+i, i+"80.72");
        }
        data.put("APPLICABLE_TERMS_CONDITIONS", "机动车综合商业保险示范条款");
        data.put("ACCIDENT_ABSOLUTELY_FRANCHISE", "500");
        data.put("AGRNT_PHONE", "1234567890");
        data.put("AGRNT_ADDRESS", "北京市石景山区实兴大街30号院1号楼");
        data.put("POS_NO", "2423421421423");
        data.put("DISCOUNT_AMOUNT", "870.72");
        data.put("REPORT_PHONE_NO", "95510");
        data.put("LINKER_NAME", "李四");
        data.put("PHONE_NO", "13910202022");
        data.put("STARTING", "北京");
        data.put("DESTINATION", "天津");
        data.put("POLICY_NO", "1234567890abcdefgh");
        data.put("AMEND_POLICY_NO", "1234567890abcdefgh_1");
        data.put("INSURED_NAME", "张三");
        data.put("CORRECTING_DATE", "2016-12-01");
        data.put("POLICY_HOLDER", "李四");
        data.put("POLICY_CERTI_CODE", "1234567890abcdefgh");
        data.put("EFFECTIVE_DATE", "2016-12-01");
        data.put("CAR_MARK", "京A12345");
        data.put("APPROVALA", "XXXXXXX\rXXXXXX");
        data.put("ELECTRONICENDORSEMENTCREATIONDATE", "2016-12-0909:12:00");
        data.put("UNDERWRITING_NAME", "张三");
        data.put("DOCUMENTATION", "赵六");
        data.put("AGENT", "李四");
        data.put("CONFIRM_SEQUENCE_NO", "02CATH02160000000000952875836A");
        data.put("AMEND_CONFIRM_NO", "02CATH02160000000000952875836A");
        data.put("COMPANY_NAME", "富德财产保险股份有限公司北京分公司");
        data.put("POLICY_EMAIL", "lisi@163.com");
        data.put("CHARGE_CONFIRMATION_TIME", "2016-12-0909:12:00");
        data.put("AMEND_PRINT_TIME", "2016-12-0909:12:00");
        data.put("REVIEW", "赵六");
        data.put("BATCH_SURRENDER_USERNAME", "赵六");
        data.put("BATCH_ACCOUNT", "1234567812345678");
        data.put("NUMBER_BANK_ACCOUNTNAME", "招商银行北京分行");
        data.put("POS_NO", "2423421421423");
        data.put("APPLICABLE_TERMS_CONDITIONS", "机动车综合商业保险示范条款");
        data.put("AGENCY_NAME", "航联保险经纪公司");
        data.put("AGENCY_NAME", "航联保险经纪公司");
        data.put("POLICY_CERTI_TYPE", "居民身份证");
        data.put("POLICY_TELEPHONE", "1234567890");
        data.put("POLICY_TABLE_HEAD", "限在北京市销售");
        data.put("QR_CODE", "E:\\Temp\\qr_code.png");
        for(int i=5;i<20;i++){
            data.put("INSURED_TEMP"+i, "备用字段1"+i);
        }
        data.put("INSURED_TEMP0", "本保单为中介业务，中介机构名称为：XXXXX");
        defaultData=data;
    }
}
