package FactoryPattern.FactoryMethod;

/**
 * 导出pdf的操作
 */
public class ExportPdfOperate extends ExportOperate{
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportPdfFile();
    }
}