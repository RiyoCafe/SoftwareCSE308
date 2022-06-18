package com.company.Burger;

import com.company.item;

public abstract class BurgerDecorator implements Burger {
    protected Burger burger;

    public BurgerDecorator(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String name() {
        return burger.name();
    }


    @Override
    public double price() {
        return burger.price();
    }
}
