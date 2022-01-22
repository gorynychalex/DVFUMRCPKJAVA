package ru.dvfu.mrcpk.java01.example06.types;

public class CompareTypes {
    public static void main(String[] args) {
//        int i = 128;
        int i = 127;
        Integer oa = i; // создание объекта+упаковка
        Integer ob = i;
        System.out.println("oa==i " + (oa == i));// true
        System.out.println("ob==i " + (ob == i));// true
        System.out.println("oa==ob " + (oa == ob));// false
        System.out.println("equals ->" + oa.equals(i) + ob.equals(i)
                + oa.equals(ob));// true
    }
}
