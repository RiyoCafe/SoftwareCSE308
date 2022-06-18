package com.company;

import java.io.File;
import java.io.IOException;

public class customClass {
    CalculatorAdapter adapter;
    CalculationOfNumbers calculation;
    File file;
    public customClass()
    {
        calculation=new CalculationOfNumbers();
    }
    public void show(File file,int choice) throws IOException {
        this.file=file;
        if(choice==2)
        {
            adapter=new CalculatorAdapter(file);
            this.file=adapter.getFile();
        }
        System.out.println(calculation.calculate_Sum(this.file));


    }
}
