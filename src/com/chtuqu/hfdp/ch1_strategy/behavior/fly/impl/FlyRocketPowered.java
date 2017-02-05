package com.chtuqu.hfdp.ch1_strategy.behavior.fly.impl;

import com.chtuqu.hfdp.ch1_strategy.behavior.fly.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}