package com.chtuqu.hfdp.ch3_decorator.starbuzz.condiment.impl;

import com.chtuqu.hfdp.ch3_decorator.starbuzz.beverage.Beverage;
import com.chtuqu.hfdp.ch3_decorator.starbuzz.condiment.CondimentDecorator;

public class SteamedMilk extends CondimentDecorator {

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
