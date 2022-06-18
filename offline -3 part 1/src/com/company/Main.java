package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        System.out.println("You want to calculate numbers sepaterated by space/special (options" +
                " available:1/2 )");
        System.out.println("write 1 for space and write 2 for special");
        Scanner scanner=new Scanner(System.in);
        String l=scanner.nextLine();
        //CalculationOfNumbers calculationOfNumbers =new CalculationOfNumbers();
        File file;
        file=new File("input.txt");
        customClass cus=new customClass();
        cus.show(file,Integer.valueOf(l));
         /*if(Integer.valueOf(l)==2)
        {
            file=new CalculatorAdapter(file).getFile();

        }
        //System.out.println(file.getName());
        System.out.println(calculationOfNumbers.calculate_Sum(file));*/


    }
}
