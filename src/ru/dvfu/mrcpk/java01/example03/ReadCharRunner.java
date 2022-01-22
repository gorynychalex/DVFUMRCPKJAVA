package ru.dvfu.mrcpk.java01.example03;

import java.io.IOException;

public class ReadCharRunner {
    public static void main(String[] args) {
        int x;
        System.out.println("Введите символ в коммандную строку:");
        try {
            x = System.in.read();
            char c = (char) x;
            System.out.println("Код символа " + c + " = " + x);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
