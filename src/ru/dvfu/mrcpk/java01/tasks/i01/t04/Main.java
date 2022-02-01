package ru.dvfu.mrcpk.java01.tasks.i01.t04;

/**
 * Написать программу, которая находит среднее арифметическое значение
 * трёх вещественных чисел.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(
                "Среднее значение: " +
                averange(20,40,50)
        );
    }

    //Метод расчета среднего арифметического значения
    public static double averange(int a, int b, int c){

        double z = (a + b + c) / 3;

        return z;
    }
}
