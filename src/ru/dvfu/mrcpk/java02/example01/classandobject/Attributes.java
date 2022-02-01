package ru.dvfu.mrcpk.java02.example01.classandobject;

import java.time.LocalDate;

public class Attributes {
    private int x; // переменная экземпляра класса
    private int y = 71; // переменная экземпляра класса
    public final int CURRENT_YEAR = 2022; // константа
    protected static int bonus; // переменная класса
    static String version = "Java SE 17"; // переменная класса
    protected LocalDate now;
    public int method(int z) { // параметр метода
        z++;
        int a; // локальная переменная метода
        // a++; // ошибка компиляции, значение не задано
        a = 4; // инициализация
        a++;
        now = LocalDate.now();//инициализация
        return a + x + y + z;
    }
}
