package com.company;

public abstract class AbstractFactory {
    abstract Communication_channel makeCommunication_channel(String name);
    abstract DisplayUnit make_display_unit(String name);
}
