package com.my.pattern.strategy;

import com.my.pattern.strategy.call.Quack;
import com.my.pattern.strategy.fly.Fly;

/**
 * @author 华安  mashuai_bj@si-tech.com.cn
 * @Title:
 * @Date: Create in 20:16 2018/4/10
 * @Description:
 */
public class ModelDuck extends Duck {

    public ModelDuck(Fly fly, Quack quack){
        this.fly=fly;
        this.quack =quack;
    }
} 