package ru.dvfu.mrcpk.java06.example01.func;

import java.util.ArrayList;
import java.util.List;

/**
 * Использование интерфейса Stream API
 */

public class Main03
{
    public static void main(String[] args) {
        User user1 = new User("Вася","Пупкин", 30);
        User user2 = new User("Коля","Иванов", 19);
        User user3 = new User("Петя","Сидоров", 40);
        List<User> users = new ArrayList<>(){{add(user1);add(user2); add(user3);}};


        // Объект стрим
        users.stream()
                .filter(user -> user.getAge() >= 20)
                .map(u->u.getLastName())
                .forEach(System.out::println);

    }
}
