package com.company.Appetizer;

import com.company.Burger.Burger;

public class FrenchFries extends Appetizer{
    public FrenchFries(Burger burger) {
        super(burger);
    }

    @Override
    public String name() {
        return burger.name()+" with French Fries ";
    }

    @Override
    public double price() {
        return burger.price()+3;
    }
}
