package com.company;

import com.company.Appetizer.FrenchFries;
import com.company.Burger.BeefBurger;
import com.company.Burger.Burger;
import com.company.Burger.cheeseBurgerDecorator;

public class Option1 {
    private Burger burger;

    public Option1()
    {
        burger=new FrenchFries(new BeefBurger());
        burger=new cheeseBurgerDecorator(burger);
    }

    public Burger getBurger() {
        return burger;
    }
}
