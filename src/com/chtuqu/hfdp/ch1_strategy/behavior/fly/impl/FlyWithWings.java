package com.chtuqu.hfdp.ch1_strategy.behavior.fly.impl;

import com.chtuqu.hfdp.ch1_strategy.behavior.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }

}
