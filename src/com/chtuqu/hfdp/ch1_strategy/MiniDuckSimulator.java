package com.chtuqu.hfdp.ch1_strategy;

import com.chtuqu.hfdp.ch1_strategy.behavior.fly.impl.FlyRocketPowered;
import com.chtuqu.hfdp.ch1_strategy.ducks.Duck;
import com.chtuqu.hfdp.ch1_strategy.ducks.impl.MallardDuck;
import com.chtuqu.hfdp.ch1_strategy.ducks.impl.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
