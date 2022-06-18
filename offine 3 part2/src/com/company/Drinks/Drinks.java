package com.company.Drinks;

import com.company.Burger.Burger;
import com.company.Burger.BurgerDecorator;
import com.company.item;

public class Drinks extends BurgerDecorator {
    public Drinks(Burger burger) {
        super(burger);
    }

}
