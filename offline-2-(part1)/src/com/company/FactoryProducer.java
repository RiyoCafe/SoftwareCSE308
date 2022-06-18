package com.company;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice)
    {
        if(choice.equalsIgnoreCase("COM"))
            return new CommunicationChannelFactory();
        else if(choice.equalsIgnoreCase("DIS"))
            return new DisplayUnitFactory();
        return null;
    }
}
