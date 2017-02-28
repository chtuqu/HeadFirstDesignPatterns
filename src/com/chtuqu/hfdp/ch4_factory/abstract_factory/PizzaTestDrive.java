package com.chtuqu.hfdp.ch4_factory.abstract_factory;

import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.pizza.Pizza;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.store.PizzaStore;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.store.impl.ChicagoPizzaStore;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.store.impl.NYPizzaStore;
import com.chtuqu.hfdp.ch4_factory.factory_method.dto.PizzaType;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza;
        pizza = nyStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Ethan ordered a " + pizza.getName());

        pizza = chicagoStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Joel ordered a " + pizza.getName());
    }
}
