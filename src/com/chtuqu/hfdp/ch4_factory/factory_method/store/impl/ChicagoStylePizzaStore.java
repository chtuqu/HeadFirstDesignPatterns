package com.chtuqu.hfdp.ch4_factory.factory_method.store.impl;

import com.chtuqu.hfdp.ch4_factory.factory_method.dto.Pizza;
import com.chtuqu.hfdp.ch4_factory.factory_method.dto.PizzaType;
import com.chtuqu.hfdp.ch4_factory.factory_method.dto.impl.chicago.ChicagoStyleCheesePizza;
import com.chtuqu.hfdp.ch4_factory.factory_method.dto.impl.chicago.ChicagoStyleClamPizza;
import com.chtuqu.hfdp.ch4_factory.factory_method.dto.impl.chicago.ChicagoStylePepperoniPizza;
import com.chtuqu.hfdp.ch4_factory.factory_method.dto.impl.chicago.ChicagoStyleVeggiePizza;
import com.chtuqu.hfdp.ch4_factory.factory_method.store.PizzaStore;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        switch (type) {
            case CHEESE: return new ChicagoStyleCheesePizza();
            case PEPPERONI: return new ChicagoStylePepperoniPizza();
            case CLAM: return new ChicagoStyleClamPizza();
            case VEGGIE: return new ChicagoStyleVeggiePizza();
            default: throw new IllegalArgumentException("Unknown pizza type: " + type);
        }
    }
}
