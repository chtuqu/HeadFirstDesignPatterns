package com.chtuqu.hfdp.ch3_decorator.starbuzz.beverage.impl;

import com.chtuqu.hfdp.ch3_decorator.starbuzz.beverage.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
