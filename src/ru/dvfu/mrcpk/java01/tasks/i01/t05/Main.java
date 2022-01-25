package ru.dvfu.mrcpk.java01.tasks.i01.t05;

import java.util.Scanner;

/**
 * Написать программу, которая находит корень линейного уравнения
 * ax + b = 0
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Находим корень линейного уравнения ax + b = 0");

        System.out.print("Введите a = ");
        double a = scanner.nextInt();

        System.out.print("\nВведите b = ");
        double b = scanner.nextInt();

        double z = -b/a;

        System.out.println("Корень линейного уравнения: " + z);
    }

    public static String findRoots(double a, double b){
        if(a==0 && b==0) {
            return "x любое";
        }
        else if(a==0) {
            return "корни уравнения отсутсвуют";
        }

        double z = -b/a;

        return String.valueOf(z);
    }
}
