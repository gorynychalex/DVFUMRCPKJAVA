package ru.dvfu.mrcpk.java01.example13.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        OptionalDemo<Integer> obj = new OptionalDemo<>();
        obj.setValue(1);

        System.out.println(obj);


    }
}
