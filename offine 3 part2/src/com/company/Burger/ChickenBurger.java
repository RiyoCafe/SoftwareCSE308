package com.company.Burger;

import com.company.Burger.Burger;

public class ChickenBurger implements Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public double price() {
        return 5;
    }

}
