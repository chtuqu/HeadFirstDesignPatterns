package com.chtuqu.hfdp.ch1_strategy.ducks.impl;

import com.chtuqu.hfdp.ch1_strategy.behavior.fly.impl.FlyWithWings;
import com.chtuqu.hfdp.ch1_strategy.behavior.quack.impl.Quack;
import com.chtuqu.hfdp.ch1_strategy.ducks.Duck;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
