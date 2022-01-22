package ru.dvfu.mrcpk.java01.example03;


import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        int i = 5;
        var sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            i = sc.nextInt();
            System.out.println("i = " + i);
        }
    }
}
