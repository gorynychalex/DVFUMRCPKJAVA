package ru.dvfu.mrcpk.java01.example07.types;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class StaticImport {
    private int i = 20, j = 40;

    public void calculate(){
        double x, y;
        x = pow(i,2);
        y = sqrt(j)/2;
        System.out.println("x=" + x + " y=" + y);
    }

    public static void main(String[] args) {
        StaticImport object = new StaticImport();
        object.calculate();
    }
}
