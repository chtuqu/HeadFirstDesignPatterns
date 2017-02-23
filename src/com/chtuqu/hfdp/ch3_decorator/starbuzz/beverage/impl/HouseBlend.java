package com.chtuqu.hfdp.ch3_decorator.starbuzz.beverage.impl;

import com.chtuqu.hfdp.ch3_decorator.starbuzz.beverage.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
