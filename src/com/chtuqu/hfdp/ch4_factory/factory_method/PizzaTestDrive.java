package com.chtuqu.hfdp.ch4_factory.factory_method;

import com.chtuqu.hfdp.ch4_factory.factory_method.pizza.Pizza;
import com.chtuqu.hfdp.ch4_factory.factory_method.pizza.PizzaType;
import com.chtuqu.hfdp.ch4_factory.factory_method.store.PizzaStore;
import com.chtuqu.hfdp.ch4_factory.factory_method.store.impl.ChicagoStylePizzaStore;
import com.chtuqu.hfdp.ch4_factory.factory_method.store.impl.NYStylePizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza;
        pizza = nyStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Ethan ordered a " + pizza.getName());

        pizza = chicagoStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Joel ordered a " + pizza.getName());
    }
}
