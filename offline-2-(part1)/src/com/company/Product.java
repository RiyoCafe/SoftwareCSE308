package com.company;

import java.util.ArrayList;

public class Product {
    private ArrayList<String> purchase_list;
    //int unit;
    public Product()
    {
        purchase_list=new ArrayList<>();
        //this.unit=unit;
    }
    public void add_item(String item)
    {
        purchase_list.add(item);
    }
    public void show()
    {
        System.out.println("Created--------------");
        for(int i=0;i<purchase_list.size();i++)
            System.out.println(purchase_list.get(i));
    }
}
