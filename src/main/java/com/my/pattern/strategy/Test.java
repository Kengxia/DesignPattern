package com.my.pattern.strategy;

import com.my.pattern.strategy.call.Quack;
import com.my.pattern.strategy.call.impl.MuteQuack;
import com.my.pattern.strategy.fly.Fly;
import com.my.pattern.strategy.fly.impl.FlyNoWay;

/**
 * @author 华安  mashuai_bj@si-tech.com.cn
 * @Title:
 * @Date: Create in 20:20 2018/4/10
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Fly fly = new FlyNoWay();
        Quack quack = new MuteQuack();
        Duck duck = new ModelDuck(fly,quack);
        duck.fly();
    }
} 