package com.my.pattern.factory.fatoryMethod;


public class ExportPdfFile implements ExportFileApi {
    @Override
    public void doExport() {
        System.out.println("do pdf export");
    }
}