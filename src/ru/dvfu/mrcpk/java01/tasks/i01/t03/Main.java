package ru.dvfu.mrcpk.java01.tasks.i01.t03;

import java.util.Scanner;

/**
 * Дано целое число n. Выведите следующее за ним четное число.
 * При решении этой задачи нельзя использовать условную инструкцию if и циклы.
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите значение:");

        int n = new Scanner(System.in).nextInt();

        //Вариант математически верный!
        int result_v1 = n - n%2 + 2;

        //Вариант математически не верный, но неполноценность типов выдает тот же результат!
        int result_v2 = 2*(n/2) + 2;

        System.out.println(result_v1);
        System.out.println(result_v2);

    }
}
