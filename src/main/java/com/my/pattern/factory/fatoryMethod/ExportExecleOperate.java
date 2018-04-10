package com.my.pattern.factory.fatoryMethod;


public class ExportExecleOperate extends ExportOperate {
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportExecleFile();
    }
}