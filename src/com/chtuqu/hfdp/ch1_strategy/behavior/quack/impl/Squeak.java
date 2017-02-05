package com.chtuqu.hfdp.ch1_strategy.behavior.quack.impl;

import com.chtuqu.hfdp.ch1_strategy.behavior.quack.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
