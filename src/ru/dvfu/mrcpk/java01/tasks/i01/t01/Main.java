package ru.dvfu.mrcpk.java01.tasks.i01.t01;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Служебное сообщение
        System.out.println("Введите значение в консоль:");

        //Создание объекта ввода
        Scanner scanner = new Scanner(System.in);

        //Инициализация переменной из ввода
        int x = scanner.nextInt();

        //Вывод и сохрание младшего разряда числа
        // 15 -> 5; 49 -> 9
        //Получение остатка от деления на 10
        int y = x % 10;

        //Вывод значения в консольк
        System.out.println(
                "Младший разряд числа  "
                        + x
                        + " равен "
                        + y
        );
    }
}
