package com.company;

import com.company.Appetizer.OnionRings;
import com.company.Burger.Burger;
import com.company.Burger.VeggiBurger;
import com.company.Drinks.Coffee;
import com.company.Drinks.Water;

public class Option4 {
    Burger burger;

    public Option4(int quantity) {
        burger=new VeggiBurger();
        burger=new OnionRings(burger);
        wrape(quantity);
    }

    public void wrape(int quantity) {
        for(int i=0;i<quantity;i++)
        {
            burger=new Coffee(burger);
            burger=new Water(burger);
        }

    }
    public Burger getBurger()
    {
        return burger;
    }
}
