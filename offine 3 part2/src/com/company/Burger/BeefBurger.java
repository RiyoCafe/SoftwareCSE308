package com.company.Burger;

import com.company.Burger.Burger;

public class BeefBurger implements Burger {
    @Override
    public String name() {
        return "Beef Burger";
    }

    @Override
    public double price() {
        return 10;
    }

}
