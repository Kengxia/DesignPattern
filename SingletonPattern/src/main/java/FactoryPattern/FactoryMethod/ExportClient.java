package FactoryPattern.FactoryMethod;

/**
 * @author 华安  mashuai_bj@si-tech.com.cn
 * @Title:
 * @Date: Create in 10:21 2018/3/6
 * @Description:
 */
public class ExportClient {

    public static void main(String[] args) {
        //导出execle格式的
        ExportOperate operate = new ExportExecleOperate();
        operate.export();

        //导出pdf格式的
        ExportOperate operatePdf = new ExportPdfOperate();
        operatePdf.export();
    }
} 