package com.chtuqu.hfdp.ch4_factory.factory_method.dto.impl.ny;

import com.chtuqu.hfdp.ch4_factory.factory_method.dto.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
