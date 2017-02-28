package com.chtuqu.hfdp.ch4_factory.abstract_factory.ingredient_factory.impl;

import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.cheese.Cheese;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.cheese.impl.ReggianoCheese;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.clams.Clams;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.clams.impl.FreshClams;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.dough.Dough;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.dough.impl.ThinCrustDough;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.pepperoni.Pepperoni;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.pepperoni.impl.SlicedPepperoni;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.sauce.Sauce;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.sauce.impl.MarinaraSauce;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.veggies.Veggies;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.veggies.impl.Garlic;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.veggies.impl.Mushroom;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.veggies.impl.Onion;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.veggies.impl.RedPepper;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.ingredient_factory.PizzaIngredientFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
