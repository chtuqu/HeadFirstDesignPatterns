package com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.pizza.impl;

import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.pizza.Pizza;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.ingredient_factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
