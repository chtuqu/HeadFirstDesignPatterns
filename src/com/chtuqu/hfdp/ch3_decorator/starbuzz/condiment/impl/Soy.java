package com.chtuqu.hfdp.ch3_decorator.starbuzz.condiment.impl;

import com.chtuqu.hfdp.ch3_decorator.starbuzz.beverage.Beverage;
import com.chtuqu.hfdp.ch3_decorator.starbuzz.condiment.CondimentDecorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
