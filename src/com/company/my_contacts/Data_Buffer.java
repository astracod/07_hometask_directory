package com.company.my_contacts;

import java.io.*;
import java.util.Scanner;

public class Data_Buffer {

    private String name;

    public Data_Buffer(){}

    public Data_Buffer(String s) {
        name = s;
    }


    public void outStream() throws IOException {

        Writer outward = new FileWriter("C:/Users/Admin/Desktop/5.txt");
        PrintWriter out = new PrintWriter(outward);
        out.print(name);
        out.flush();
        out.close();
    }

    public String inputStream() throws FileNotFoundException {

        InputStream in = new FileInputStream("C:/Users/Admin/Desktop/5.txt");
        Scanner sc = new Scanner(in);
        String a = sc.nextLine();
        return a;
    }
}