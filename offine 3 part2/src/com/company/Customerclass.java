package com.company;


import com.company.Burger.Burger;


public class Customerclass {
    private int choice;
    private int quantity;
    Burger burger;

    public Customerclass(int choice, int quantity) {
        this.choice = choice;
        this.quantity = quantity;
    }

    public void doJob()
    {
        if(choice==1)
        {
            burger=new Option1().getBurger();
            System.out.println(burger.name()+" "+burger.price());

        }else if(choice==2)
        {
            burger=new Option2(quantity).getBurger();
            System.out.println(burger.name()+" "+burger.price());
        }else if(choice==3)
        {
            burger=new Option3(quantity).getBurger();
            System.out.println(burger.name()+" "+burger.price());
        }else if(choice==4)
        {
            burger=new Option4(quantity).getBurger();
            System.out.println(burger.name()+" "+burger.price());
        }else if(choice==5)
        {
            burger=new Option5().getBurger();
            System.out.println(burger.name()+" "+burger.price());
        }
    }
}
