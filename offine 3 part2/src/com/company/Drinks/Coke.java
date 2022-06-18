package com.company.Drinks;

import com.company.Burger.Burger;

public class Coke extends Drinks{
    public Coke(Burger burger) {
        super(burger);
    }

    @Override
    public String name() {
        return burger.name()+" with Coke";
    }

    @Override
    public double price() {
        return burger.price()+5;
    }
}
