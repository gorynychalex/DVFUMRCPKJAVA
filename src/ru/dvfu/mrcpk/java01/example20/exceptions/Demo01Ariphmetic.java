package ru.dvfu.mrcpk.java01.example20.exceptions;

public class Demo01Ariphmetic {
    public static void main(String[] args) {
        int a = 10, b=0, z;

        try {
            z = a/b;
        } catch (Exception e) {
            System.out.println("Возникла ошибка! Деление на НОЛЬ! НЕЛЬЗЯ!");
        }

        System.out.println("Продолжение выполнения программы!");
    }
}
