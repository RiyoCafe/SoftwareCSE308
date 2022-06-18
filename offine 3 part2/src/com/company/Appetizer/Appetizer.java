package com.company.Appetizer;

import com.company.Burger.Burger;
import com.company.Burger.BurgerDecorator;
import com.company.item;

public class Appetizer extends BurgerDecorator {
    public Appetizer(Burger burger) {
        super(burger);
    }

    @Override
    public String name() {
        return "Appetizer";
    }

    @Override
    public double price() {
        return 0;
    }


}
