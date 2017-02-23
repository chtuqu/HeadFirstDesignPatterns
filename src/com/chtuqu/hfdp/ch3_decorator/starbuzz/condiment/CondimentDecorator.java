package com.chtuqu.hfdp.ch3_decorator.starbuzz.condiment;

import com.chtuqu.hfdp.ch3_decorator.starbuzz.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    public abstract String getDescription();

}
