package com.chtuqu.hfdp.ch4_factory.abstract_factory.ingredient_factory.impl;

import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.cheese.Cheese;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.cheese.impl.Mozzarella;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.clams.Clams;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.clams.impl.FrozenClams;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.dough.Dough;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.dough.impl.ThickCrustDough;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.pepperoni.Pepperoni;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.pepperoni.impl.SlicedPepperoni;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.sauce.Sauce;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.sauce.impl.PlumTomatoSauce;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.veggies.Veggies;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.veggies.impl.BlackOlives;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.veggies.impl.EggPlant;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.veggies.impl.Spinach;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.ingredient_factory.PizzaIngredientFactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] { new BlackOlives(), new Spinach(), new EggPlant() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
