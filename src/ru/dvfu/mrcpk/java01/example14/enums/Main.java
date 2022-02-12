package ru.dvfu.mrcpk.java01.example14.enums;

public class Main {
    public static void main(String[] args) {
        System.out.println(Days.MONDAY);

        SingletonDemo singletonDemo = SingletonDemo.INSTANCE;
        singletonDemo.method();
    }
}
