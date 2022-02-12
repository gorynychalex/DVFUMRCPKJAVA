package ru.dvfu.mrcpk.java01.example14.enums;

public enum SingletonDemo {
    INSTANCE;

    public void method(){
        System.out.println("Method from singleton");
    }
}
