package ru.dvfu.mrcpk.java01.example08.array;

import java.util.Arrays;

/**
 * Сортировка вставками (Insertion Sort)
 *
 *
 */
public class InsertionSort {

    public static int[] sort(int[] array){
        for (int left = 0; left < array.length; left++) {
            // Вытаскиваем значение элемента
            int value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }

        return array;
    }

    public static void main(String[] args) {
        System.out.print("Входной массив: ");
        int[] a = new int[]{8,2,6,3,9,5,2};
//        int[] a = new int[]{1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(a));

        int[] r = sort(a);

        System.out.print("Отсортированный массив: ");
        System.out.println(Arrays.toString(r));
    }
}
