package com.chtuqu.hfdp.ch3_decorator.starbuzz.beverage.impl;

import com.chtuqu.hfdp.ch3_decorator.starbuzz.beverage.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
