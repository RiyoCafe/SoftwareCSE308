package com.company;

public class Delunxe implements DisplayUnit {
    Processsor processsor;
    DisplaySystem displaySystem;
    Application application;

    public Delunxe() {
        processsor=new Rasberry_PI();
        displaySystem=new LCD_pannel();
        application=new Application();
    }

    @Override
    public Processsor getProcessor() {
        return processsor;
    }

    @Override
    public DisplaySystem getDisplaySystem() {
        return displaySystem;
    }

    @Override
    public int price() {
        return processsor.getPrice()+displaySystem.getPrice()+application.getPrice();
    }

    @Override
    public String  show_details() {
        return processsor.getName()+" is added & "+displaySystem.getName()+" is added "+ "Application price is added "+
                " and prices are "+processsor.getPrice()+" and "+displaySystem.getPrice()+" and "+application.getPrice();

    }

    @Override
    public String getApplication() {
        return "Delunxe Application Added "+application.control_unit();
    }
}
