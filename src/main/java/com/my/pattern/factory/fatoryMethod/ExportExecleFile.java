package com.my.pattern.factory.fatoryMethod;
/**
 * 具体的product实现
 */
public class ExportExecleFile implements ExportFileApi{
    @Override
    public void doExport() {
        System.out.println("do execle export");
    }
}