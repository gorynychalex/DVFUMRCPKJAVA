package ru.dvfu.mrcpk.java01.example08.collections1;

import java.util.HashSet;
import java.util.Set;

/**
 * Collection - set
 * Интерфейс коллекций - наборы неповторящихся значений
 */

public class Main02set {
    public static void main(String[] args) {
        Set<Integer> set01 = new HashSet<>();
        set01.add(10);
        set01.add(20);
        set01.add(30);
        set01.add(10);
        set01.add(30);

        for(Integer x: set01){
            System.out.print(x + "\t");
        }
    }
}
