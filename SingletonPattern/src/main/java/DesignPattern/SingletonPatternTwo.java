package DesignPattern;

/**
 * 懒汉:体现了延迟加载、缓存的思想，但是是非线程安全的
 */
public class SingletonPatternTwo {

    private static SingletonPatternTwo singletonSynchron =null;

    private SingletonPatternTwo(){

    };

    public static SingletonPatternTwo newInstance(){
        if(singletonSynchron==null){
            singletonSynchron = new SingletonPatternTwo();
        }
        return singletonSynchron;
    }
} 