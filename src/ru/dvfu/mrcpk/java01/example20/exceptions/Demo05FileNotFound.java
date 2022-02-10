package ru.dvfu.mrcpk.java01.example20.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo05FileNotFound {
    public static void main(String[] args) {
        try {
            FileInputStream f=new FileInputStream("/home/gorynych/java/file.txt");
            while (f.available()>0){
                int b = f.read();
                System.out.print((char)b + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
