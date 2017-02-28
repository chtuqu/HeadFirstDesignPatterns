package com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.pizza;

import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.cheese.Cheese;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.clams.Clams;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.dough.Dough;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.pepperoni.Pepperoni;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.sauce.Sauce;
import com.chtuqu.hfdp.ch4_factory.abstract_factory.dto.veggies.Veggies;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
