package com.chtuqu.hfdp.ch3_decorator.starbuzz.beverage.impl;

import com.chtuqu.hfdp.ch3_decorator.starbuzz.beverage.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
