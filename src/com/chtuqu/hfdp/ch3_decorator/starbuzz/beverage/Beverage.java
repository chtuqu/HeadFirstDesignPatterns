package com.chtuqu.hfdp.ch3_decorator.starbuzz.beverage;

public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
