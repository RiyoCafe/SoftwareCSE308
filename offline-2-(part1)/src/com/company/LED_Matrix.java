package com.company;

public class LED_Matrix implements DisplaySystem{
    @Override
    public String getName() {
        return "LED matrix";
    }

    @Override
    public int getPrice() {
        return 10;
    }
}
