package com.chtuqu.hfdp.ch4_factory.factory_method.store;

import com.chtuqu.hfdp.ch4_factory.factory_method.dto.Pizza;
import com.chtuqu.hfdp.ch4_factory.factory_method.dto.PizzaType;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(PizzaType type);
}
