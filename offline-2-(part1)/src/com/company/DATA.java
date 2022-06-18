package com.company;

public class DATA implements Communication_channel{

    @Override
    public String getName() {
        return "DATA COMPONENT";
    }

    @Override
    public int getPrice() {
        return 200;
    }

    @Override
    public int year() {
        return 2;
    }
}
