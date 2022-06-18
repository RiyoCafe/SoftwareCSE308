package com.company;

public class LCD_pannel implements DisplaySystem{
    @Override
    public String getName() {
        return "LCD pannel";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
