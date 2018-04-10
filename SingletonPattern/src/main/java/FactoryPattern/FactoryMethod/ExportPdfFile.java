package FactoryPattern.FactoryMethod;


public class ExportPdfFile implements ExportFileApi {
    @Override
    public void doExport() {
        System.out.println("do pdf export");
    }
}