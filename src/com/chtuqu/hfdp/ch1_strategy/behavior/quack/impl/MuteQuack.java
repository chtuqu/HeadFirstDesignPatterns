package com.chtuqu.hfdp.ch1_strategy.behavior.quack.impl;

import com.chtuqu.hfdp.ch1_strategy.behavior.quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
