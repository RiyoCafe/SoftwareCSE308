package com.company;

import java.io.*;

public class CalculatorAdapter {
    private File file;

    public CalculatorAdapter(File file) throws IOException {
        //this.file=file;
        this.file=changeTospace(file);

    }
    public File changeTospace(File file) throws IOException {
        File temporary=new File("temp.txt");
        temporary.createNewFile();
        FileWriter fileWriter=new FileWriter(temporary.getName());

        BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
        String s=bufferedReader.readLine();
        String str[]=s.split("~");
        for(int i=0;i< str.length;i++)
        {
            fileWriter.write(str[i]+" ");
        }
        fileWriter.close();
        return temporary;

    }

    public File getFile() {
        return file;
    }
}
