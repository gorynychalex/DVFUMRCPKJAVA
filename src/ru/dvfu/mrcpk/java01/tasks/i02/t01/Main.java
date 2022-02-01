package ru.dvfu.mrcpk.java01.tasks.i02.t01;

/**
 * Ввести с клавиатуры два 3-значных числа и поменять у них средние цифры
 * (например, ввести 357  и 702 – получить и вывести числа  307 и 752)
 */

public class Main {
    public static void main(String[] args) {
        int a = 357, b = 702;

        int aba = a-a%100 + b%100-b%10 + a%10;
        int bab = b-b%100 + a%100-a%10 + b%10;

        System.out.println(aba);
        System.out.println(bab);
    }
}
