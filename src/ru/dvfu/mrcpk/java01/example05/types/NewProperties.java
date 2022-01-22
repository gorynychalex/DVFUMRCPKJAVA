package ru.dvfu.mrcpk.java01.example05.types;

public class NewProperties {
    public static void main(String[] args) {
        Integer j = 71; // создание объекта+упаковка
        Integer k = ++j; // распаковка+операция+упаковка
        int i = 2;
        k = i + j + k;
        System.out.println(k);
    }
}
