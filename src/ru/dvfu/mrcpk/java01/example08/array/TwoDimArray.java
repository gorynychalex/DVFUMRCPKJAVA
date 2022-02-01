package ru.dvfu.mrcpk.java01.example08.array;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class TwoDimArray {
    public static void main(String[] args) {

        int[] i = new int[]{1,2,3};
        int[][] ii = new int[][]{
                {1,2},
                {3,4}
        };

        String ss = "String111";
        ss.equals("String111");

        String ss1;
        ss1 = new String();

        for (int j = 0; j < ii.length; j++) {
            for (int k = 0; k < ii[0].length; k++) {
//                System.out.print(ii[j][k] + " ");
            }
        }
    }
}
