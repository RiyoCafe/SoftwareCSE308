package com.company.Drinks;

import com.company.Burger.Burger;

public class Coffee extends Drinks{
    public Coffee(Burger burger) {
        super(burger);
    }

    @Override
    public String name() {
        return burger.name()+" with Coffee";
    }

    @Override
    public double price() {
        return burger.price()+5;
    }
}
