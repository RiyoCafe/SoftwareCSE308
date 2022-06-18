package com.company;

import com.company.Appetizer.OnionRings;
import com.company.Burger.Burger;
import com.company.Burger.VeggiBurger;
import com.company.Drinks.Coke;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        System.out.println("==================Food Menu===============");
        System.out.println("1.Beef burger with French fry and cheese\n" +
                            "2.Veggi burger with onion rings and Bottle of Water \n"+
                            "3.A combo meal with Veggi burger, French Fry and Coke \n"+
                            "4.A combo meal with Veggi burger, Onion Rings, Coffee and Water \n"+
                            "5.A Beef burger only");
        System.out.println("Please Enter your choice: ");
        Scanner scanner=new Scanner(System.in);
        int choice=Integer.valueOf(scanner.nextLine());
        int quantity=1;
        if(choice==2)
        {
            System.out.println("how many bottles of water do you need?");
            quantity=scanner.nextInt();
        }else if(choice==3)
        {
            System.out.println("how many bottles of coke do you need?");
            quantity=scanner.nextInt();
        }else if(choice==4)
        {
            System.out.println("how many bottles of coffee and water do you need?");
            quantity=scanner.nextInt();
        }
        Customerclass customerclass=new Customerclass(choice,quantity);
        customerclass.doJob();

    }
}
