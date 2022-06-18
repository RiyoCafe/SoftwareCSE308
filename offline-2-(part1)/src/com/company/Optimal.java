package com.company;

public class Optimal implements DisplayUnit {
    Processsor processsor;
    DisplaySystem displaySystem;
    Application application;

    public Optimal() {
        processsor=new AurDuino_Mega();
        displaySystem=new LED_Matrix();
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
        return processsor.getPrice()+displaySystem.getPrice();
    }

    @Override
    public String  show_details() {
        return processsor.getName()+" is added & "+displaySystem.getName()+" is added "+ "Application price is added "+
                " and prices are "+processsor.getPrice()+" and "+displaySystem.getPrice()+" and "+application.getPrice();

    }

    @Override
    public String getApplication() {
        return "Optimal Application added"+application.control_unit();
    }
}
