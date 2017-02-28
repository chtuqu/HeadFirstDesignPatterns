package com.chtuqu.hfdp.ch4_factory.factory_method.store.impl;

import com.chtuqu.hfdp.ch4_factory.factory_method.dto.Pizza;
import com.chtuqu.hfdp.ch4_factory.factory_method.dto.PizzaType;
import com.chtuqu.hfdp.ch4_factory.factory_method.dto.impl.ny.NYStyleCheesePizza;
import com.chtuqu.hfdp.ch4_factory.factory_method.dto.impl.ny.NYStyleClamPizza;
import com.chtuqu.hfdp.ch4_factory.factory_method.dto.impl.ny.NYStylePepperoniPizza;
import com.chtuqu.hfdp.ch4_factory.factory_method.dto.impl.ny.NYStyleVeggiePizza;
import com.chtuqu.hfdp.ch4_factory.factory_method.store.PizzaStore;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        switch (type) {
            case CHEESE: return new NYStyleCheesePizza();
            case PEPPERONI: return new NYStylePepperoniPizza();
            case CLAM: return new NYStyleClamPizza();
            case VEGGIE: return new NYStyleVeggiePizza();
            default: throw new IllegalArgumentException("Unknown pizza type: " + type);
        }
    }
}
