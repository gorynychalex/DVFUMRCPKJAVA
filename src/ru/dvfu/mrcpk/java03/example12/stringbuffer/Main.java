package ru.dvfu.mrcpk.java03.example12.stringbuffer;

public class Main {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Внимание: ");
        System.out.println(s);
        s.append(123);
        System.out.println(s);
        s.insert(3, "_вставка_");
        System.out.println(s);
        System.out.println(s.charAt(3));
    }
}
