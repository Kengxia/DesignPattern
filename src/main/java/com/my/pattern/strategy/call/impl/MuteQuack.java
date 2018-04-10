package com.my.pattern.strategy.call.impl;

import com.my.pattern.strategy.call.Quack;

/**
 * @author 华安  mashuai_bj@si-tech.com.cn
 * @Title:
 * @Date: Create in 20:13 2018/4/10
 * @Description:
 */
public class MuteQuack implements Quack{
    @Override
    public void doQuack() {
        System.out.println("mute............");
    }
}