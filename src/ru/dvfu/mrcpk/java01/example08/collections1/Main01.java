package ru.dvfu.mrcpk.java01.example08.collections1;

import java.util.ArrayList;
import java.util.List;

/**
 * Collection - array
 * Интерфейс коллекций - динамический массив
 */
public class Main01 {
    public static void main(String[] args) throws Exception {

        // Инициализация новой коллекции - типа динамический массив
        List<Integer> arr = new ArrayList<>(15)
        {{
            add(10); add(20); add(30); add(20);
        }}
        ;

        System.out.println("Размер массива: " + arr.size());

        // Так добавляются новые значения в существующую коллекцию
        arr.add(60); arr.add(80);

        // Так удаляются значения: по индексу и по значению
        arr.remove(2);
        arr.remove(Integer.valueOf(20)); // Здесь лучше поставить точки и посмотреть дебаггером, что происходит!

        // Так изменяются значения по индексу
        arr.set(2,77);

        // Вывод в строку значений
        for (Integer x:arr) { System.out.print(x + "\t");}

    }
}
