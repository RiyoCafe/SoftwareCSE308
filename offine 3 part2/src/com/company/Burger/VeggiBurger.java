package com.company.Burger;

import com.company.Burger.Burger;

public class VeggiBurger implements Burger {
    @Override
    public String name() {
        return "Veggi Burger";
    }

    @Override
    public double price() {
        return 2;
    }

}
