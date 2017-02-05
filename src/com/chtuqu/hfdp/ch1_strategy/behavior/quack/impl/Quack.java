package com.chtuqu.hfdp.ch1_strategy.behavior.quack.impl;

import com.chtuqu.hfdp.ch1_strategy.behavior.quack.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}