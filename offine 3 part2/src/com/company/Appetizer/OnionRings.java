package com.company.Appetizer;

import com.company.Burger.Burger;

public class OnionRings extends Appetizer{
    public OnionRings(Burger burger) {
        super(burger);
    }

    @Override
    public String name() {
        return burger.name()+" with Onion Rings ";
    }

    @Override
    public double price() {
        return burger.price()+12;
    }
}
