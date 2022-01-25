package ru.dvfu.mrcpk.java01.example08.array;

import java.util.Arrays;

/**
 * (Bubble Sort)
 * Алгоритм состоит из повторяющихся проходов по сортируемому массиву.
 * За каждый проход элементы последовательно сравниваются попарно и,
 * если порядок в паре неверный, выполняется перестановка элементов.
 *
 * Проходы по массиву повторяются N-1 раз или до тех пор,
 * пока на очередном проходе не окажется, что обмены больше не нужны,
 * что означает — массив отсортирован.
 */

public class BubbleSort {

    public static int[] sort1(int[] array){

        for (int j = 0; j < array.length-2; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                //Перемена мест - можно вынести в отдельный метод
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
            System.out.println("Итерация: " + (j+1));
            System.out.println(Arrays.toString(array));
        }

        return array;
    }

    public static int[] sort2(int[] array){
        int j=1;
        boolean ready = false;
        while (!ready) {
            ready = true;
            for (int i = 0; i < array.length - 1; i++) {
                //Перемена мест
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    ready = false;
                }
            }
            System.out.println("Итерация: " + j++);
            System.out.println(Arrays.toString(array));
        }
        return array;
    }

    public static void main(String[] args) {

        System.out.print("Входной массив: ");
        int[] a = new int[]{8,2,6,3,9,5,2};
//        int[] a = new int[]{1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(a));

        int[] r = sort1(a);
//        int[] r = sort2(a);

        System.out.print("Отсортированный массив: ");
        System.out.println(Arrays.toString(r));
    }

}
