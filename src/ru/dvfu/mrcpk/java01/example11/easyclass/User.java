package ru.dvfu.mrcpk.java01.example11.easyclass;

public class User extends Object{
    private String name;
    private int age;
    private String phoneNumber;

    public User(String name){
        this.name=name;
    }

    public User(String name, int age){
        this(name);
        this.age = age;
    }

    public User(String name, int age, String phoneNumber){
        this(name,age);
        this.phoneNumber = phoneNumber;
    }
}
