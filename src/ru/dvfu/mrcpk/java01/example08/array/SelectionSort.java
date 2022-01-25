package ru.dvfu.mrcpk.java01.example08.array;

import java.util.Arrays;

/**
 * Сортировка выбором (Selection Sort)
 *
 * Идея:
 * Каждый проход выбирать самый минимальный элемент и смещать его в начало.
 * При этом каждый новый проход начинать сдвигаясь вправо,
 * то есть первый проход — с первого элемента, второй проход — со второго.
 */

public class SelectionSort {

    public static int[] sort1(int[] array){

        for (int left = 0; left < array.length; left++) {

            int minInd = left;

            for (int i = left; i < array.length; i++) {

                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }

            if(array[minInd] < array[left]) {
                int tmp = array[left];
                array[left] = array[minInd];
                array[minInd]=tmp;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.print("Входной массив: ");
        int[] a = new int[]{8,2,6,3,9,5,2};
//        int[] a = new int[]{1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(a));

        int[] r = sort1(a);

        System.out.print("Отсортированный массив: ");
        System.out.println(Arrays.toString(r));
    }
}
