package com.company;

import com.company.Appetizer.FrenchFries;

import com.company.Burger.Burger;
import com.company.Burger.VeggiBurger;
import com.company.Drinks.Coke;


public class Option3 {
    Burger burger;

    public Option3(int quantity) {
        burger=new VeggiBurger();
        burger=new FrenchFries(burger);
        wrape(quantity);
    }

    public void wrape(int quantity) {
        for(int i=0;i<quantity;i++)
            burger=new Coke(burger);

    }
    public Burger getBurger()
    {
        return burger;
    }
}
