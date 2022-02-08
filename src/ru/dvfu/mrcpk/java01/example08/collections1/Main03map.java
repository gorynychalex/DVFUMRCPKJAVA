package ru.dvfu.mrcpk.java01.example08.collections1;

import java.util.HashMap;
import java.util.Map;

/**
 * Map - интерфейс ассоциативного массива
 */
public class Main03map {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap();
        map.put(10,"First");
        map.put(20,"second");
        map.put(30,"third");
        map.put(20,"OneMoreSecond");

        for(Map.Entry<Integer,String> a: map.entrySet()){
            System.out.println(a.getKey() + " : " + a.getValue());
        }
    }
}
