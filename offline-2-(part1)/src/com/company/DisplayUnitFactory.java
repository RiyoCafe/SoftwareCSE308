package com.company;

public class DisplayUnitFactory extends AbstractFactory{
    @Override
    Communication_channel makeCommunication_channel(String name) {
        return null;
    }

    public DisplayUnit make_display_unit(String name)
    {
        if(name.equalsIgnoreCase("Delunxe"))
        {
            return new Delunxe();
        }
        else if(name.equalsIgnoreCase("optimal"))
            return new Optimal();
        else if(name.equalsIgnoreCase("Poor"))
            return new Poor();
        return null;
    }
}
