package com.company;

public class IBuilder {
    Product purchase;

    public IBuilder() {
        purchase=new Product();
    }

    public void createSystem(int Unit, String Channel, String Display_unit)
    {
        AbstractFactory factory=FactoryProducer.getFactory("Com");
        AbstractFactory factory1=FactoryProducer.getFactory("DIS");
        Communication_channel communication_channel=factory.makeCommunication_channel(Channel);
        DisplayUnit displayUnit=factory1.make_display_unit(Display_unit);
        purchase.add_item(displayUnit.getApplication()+" is added for "+Unit+" units");
        for(int i=0;i<Unit;i++)
        {
            purchase.add_item(communication_channel.getName()+ " is added for price "+communication_channel.getPrice());
            purchase.add_item(displayUnit.show_details());
            purchase.add_item("Total price for per Unit "+displayUnit.price());
        }
        purchase.add_item("Total "+Unit+" is purchased and price/bill is for Display Unit  is "+Unit*displayUnit.price()+" " +
                "and communication channel is "+Unit*communication_channel.getPrice());

    }
    public Product getPurchase()
    {
        return purchase;
    }
}
