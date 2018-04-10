package com.my.pattern.strategy;

import com.my.pattern.strategy.call.Quack;
import com.my.pattern.strategy.fly.Fly;

/**
 * @author 华安  mashuai
 * @Title:
 * @Date: Create in 19:53 2018/4/10
 * @Description:
 */
public abstract class Duck {
    public Fly fly;
    public Quack quack;

    /**
     *  变化的
     */
    public void fly(){
        this.fly.doFly();
    }
    public void quack(){
        this.quack.doQuack();
    }
    /**
     * 不变的
     */
    public void swim(){
        System.out.println("all duck can swim");
    }
} 