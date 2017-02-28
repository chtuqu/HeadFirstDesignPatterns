package com.chtuqu.hfdp.ch4_factory.abstract_factory.ingredient_factory;

import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.cheese.Cheese;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.clams.Clams;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.dough.Dough;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.pepperoni.Pepperoni;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.sauce.Sauce;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.veggies.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}
