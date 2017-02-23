package com.chtuqu.hfdp.ch3_decorator.starbuzz.condiment.impl;

import com.chtuqu.hfdp.ch3_decorator.starbuzz.beverage.Beverage;
import com.chtuqu.hfdp.ch3_decorator.starbuzz.condiment.CondimentDecorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
