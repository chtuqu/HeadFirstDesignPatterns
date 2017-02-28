package com.chtuqu.hfdp.ch4_factory.abstract_factory.store.impl;

import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.pizza.Pizza;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.pizza.impl.CheesePizza;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.pizza.impl.ClamPizza;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.ingredient_factory.PizzaIngredientFactory;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.ingredient_factory.impl.NYPizzaIngredientFactory;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.store.PizzaStore;
import com.chtuqu.hfdp.ch4_factory.factory_method.dto.PizzaType;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType type) {
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        switch (type) {
            case CHEESE: {
                Pizza pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                return pizza;
            }
            case CLAM: {
                Pizza pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
                return pizza;
            }
            default: throw new IllegalArgumentException("Unknown pizza type: " + type);
        }
    }

}
