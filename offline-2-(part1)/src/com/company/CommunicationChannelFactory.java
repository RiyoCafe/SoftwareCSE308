package com.company;

public class CommunicationChannelFactory extends AbstractFactory {
    public Communication_channel makeCommunication_channel(String name)
    {
        if(name.equalsIgnoreCase("Wifi"))
            return new WIFI();
        else if(name.equalsIgnoreCase("data"))
            return new DATA();
        return null;
    }

    @Override
    DisplayUnit make_display_unit(String name) {
        return null;
    }
}
