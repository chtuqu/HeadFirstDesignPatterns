package com.chtuqu.hfdp.ch1_strategy.ducks.impl;

import com.chtuqu.hfdp.ch1_strategy.behavior.fly.impl.FlyNoWay;
import com.chtuqu.hfdp.ch1_strategy.behavior.quack.impl.Quack;
import com.chtuqu.hfdp.ch1_strategy.ducks.Duck;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
