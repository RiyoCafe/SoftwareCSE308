package com.company.Drinks;

import com.company.Burger.Burger;

public class Water extends Drinks{
    public Water(Burger burger) {
        super(burger);
    }

    @Override
    public String name() {
        return burger.name()+" with Water";
    }

    @Override
    public double price() {
        return burger.price()+2;
    }

}
