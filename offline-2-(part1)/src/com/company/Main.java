package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        IBuilder builder=new IBuilder();
        Scanner scanner=new Scanner(System.in);
        String token=scanner.nextLine();
        String[] tokens=token.split(" ");
        builder.createSystem(Integer.valueOf(tokens[0]),tokens[1],tokens[2]);

        Product product=builder.getPurchase();
        product.show();
    }
}
