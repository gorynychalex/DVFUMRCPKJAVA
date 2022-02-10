package ru.dvfu.mrcpk.java01.example20.exceptions;

import java.util.Scanner;

public class Demo02Input {
    public static void main(String[] args) {
        int[] m = {-1,0,1};
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            m[a] = 4 / a;
        } catch (ArithmeticException e ){
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException a){
            a.printStackTrace();
        }
    }
}
