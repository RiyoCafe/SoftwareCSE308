package com.company;

public class WIFI implements Communication_channel{
    @Override
    public String getName() {
        return "WIFI_module";
    }

    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public int year() {
        return 2;
    }
}
