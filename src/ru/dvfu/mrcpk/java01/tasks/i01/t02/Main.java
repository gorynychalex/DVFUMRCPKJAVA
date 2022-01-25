package ru.dvfu.mrcpk.java01.tasks.i01.t02;

import java.util.Scanner;

/**
 * С клавиатуры вводится двузначное натуральное число.
 * Вывести на экран количество десятков в нем.
 */

public class Main {
    public static void main(String[] args) {

        //Служебное сообщение
        System.out.println("Введите значение в консоль:");

        //Создание объекта ввода, вызов метода и инициализация переменной
        int x = new Scanner(System.in).nextInt();

        //Вычисление количества десятков
        int y = (x-x%10)/10;


        //Вывод значения в консольк
        System.out.println(
                "Количество десятков в числе  "
                        + x
                        + " равно "
                        + y
        );

    }
}
