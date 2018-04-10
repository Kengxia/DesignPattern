package com.my.pattern.singleton;

/**
 * 线程安全的 懒汉模式，双重校验
 */
public class SinglePatternThree {

    private volatile static SinglePatternThree singlePatternThree = null;

    private SinglePatternThree() {
    }

    public static SinglePatternThree newInstance() {
        /**
         * 只有在第一次初始化的时候才会进行同步
         */
        //先检查实例是否存在，如果不存在才进入下面的同步块
        if (singlePatternThree == null) {
            //同步块，线程安全的创建实例
            synchronized (SinglePatternThree.class) {
                //再次检查实例是否存在，如果不存在才真的创建实例
                if (singlePatternThree == null) {
                    singlePatternThree = new SinglePatternThree();
                }
            }
        }
        return singlePatternThree;
    }
} 