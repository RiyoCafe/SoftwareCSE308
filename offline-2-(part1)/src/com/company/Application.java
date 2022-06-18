package com.company;

public class Application {
    private  int price;
    public Application()
    {
        price=100;
    }
    public String control_unit()
    {
        return "Application is being controlled by someone\n";
    }

    public int getPrice() {
        return price;
    }
}
