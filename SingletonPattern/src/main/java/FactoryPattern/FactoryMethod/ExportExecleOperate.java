package FactoryPattern.FactoryMethod;


public class ExportExecleOperate extends ExportOperate {
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportExecleFile();
    }
}