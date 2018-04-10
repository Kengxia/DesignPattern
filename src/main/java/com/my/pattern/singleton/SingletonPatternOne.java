package com.my.pattern.singleton;

/**
 * 饿汉: 线程安全，不管用没用到都会实例化.空间换时间
 */
public class SingletonPatternOne {

    private static SingletonPatternOne singletonPatternOne =new SingletonPatternOne();
    private SingletonPatternOne(){};

    public static SingletonPatternOne newInstance(){
        return  singletonPatternOne;
    }
} 