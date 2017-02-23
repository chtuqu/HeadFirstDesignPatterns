package com.chtuqu.hfdp.ch3_decorator.starbuzz.condiment.impl;

import com.chtuqu.hfdp.ch3_decorator.starbuzz.beverage.Beverage;
import com.chtuqu.hfdp.ch3_decorator.starbuzz.condiment.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
