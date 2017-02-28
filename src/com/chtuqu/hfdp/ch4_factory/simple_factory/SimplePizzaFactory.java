package com.chtuqu.hfdp.ch4_factory.simple_factory;

import com.chtuqu.hfdp.ch4_factory.simple_factory.pizza.Pizza;
import com.chtuqu.hfdp.ch4_factory.simple_factory.pizza.impl.CheesePizza;
import com.chtuqu.hfdp.ch4_factory.simple_factory.pizza.impl.GreekPizza;
import com.chtuqu.hfdp.ch4_factory.simple_factory.pizza.impl.PepperoniPizza;

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