package com.company;

import java.io.*;

public class CalculationOfNumbers {
    public double calculate_Sum(File file) throws IOException {
      // File  file=new File(name);
       BufferedReader br=new BufferedReader(new FileReader(file));
        System.out.println(file.getName());
       String st=br.readLine();
       String strings[]=st.split(" ");
       double sum=0;
       for(int i=0;i<strings.length;i++)
       {
           sum+=Double.valueOf(strings[i]);
       }

       return sum;

    }
}
