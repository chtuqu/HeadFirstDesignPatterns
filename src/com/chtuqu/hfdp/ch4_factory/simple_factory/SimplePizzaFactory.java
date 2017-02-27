package com.chtuqu.hfdp.ch4_factory.simple_factory;

import com.chtuqu.hfdp.ch4_factory.simple_factory.dto.Pizza;
import com.chtuqu.hfdp.ch4_factory.simple_factory.dto.impl.CheesePizza;
import com.chtuqu.hfdp.ch4_factory.simple_factory.dto.impl.GreekPizza;
import com.chtuqu.hfdp.ch4_factory.simple_factory.dto.impl.PepperoniPizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new CheesePizza();
            case "greek":
                return new GreekPizza();
            case "pepperoni":
                return new PepperoniPizza();
            default: throw new IllegalArgumentException("Unknown pizza type: " + type);
        }
    }
}