package com.my.pattern.strategy.fly.impl;

import com.my.pattern.strategy.fly.Fly;

/**
 * @author 华安  mashuai_bj@si-tech.com.cn
 * @Title:
 * @Date: Create in 19:56 2018/4/10
 * @Description:
 */
public class FlyNoWay implements Fly {
    @Override
    public void doFly() {
        System.out.println("im can not fly");
    }
}