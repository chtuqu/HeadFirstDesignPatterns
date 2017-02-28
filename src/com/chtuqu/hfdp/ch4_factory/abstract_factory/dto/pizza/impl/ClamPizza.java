package com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.pizza.impl;

import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.pizza.Pizza;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.ingredient_factory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClams();
    }
}
