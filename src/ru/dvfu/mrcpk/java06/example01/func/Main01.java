package ru.dvfu.mrcpk.java06.example01.func;

import java.util.ArrayList;
import java.util.List;

/**
 * Объектно-ориентированный и имеративный способ фильтрации
 * по параметру
 * Java < 8 (1.8)
 *
 */

public class Main01 {
    public static void main(String[] args) {

        // Создание пользователей
        User user1 = new User("Вася","Пупкин", 30);
        User user2 = new User("Коля","Иванов", 19);
        User user3 = new User("Петя","Сидоров", 40);

        // Создание списка пользователей
        List<User> userList = new ArrayList<>(){{add(user1);add(user2); add(user3);}};

        // Создание объекта фильтрации для 1-го объекта
        UserFilter userFilter = new UserFilter() {
            @Override
            public boolean test(User user) {
                return user.getAge() >= 18;
            }
        };

        // Создание объекта фильтрации для всего списка
        UserListFilter userListFilter = (users,filter) -> {
            List<User> userListResult = new ArrayList<>();
            for (User u: users) {
                if(filter.test(u)) {
                    userListResult.add(u);
                    System.out.println(u.getFirstName() + " : " + u.getLastName());
                }
            }
            return userListResult;
        };

        // Фильтрация объектов
        userListFilter.test(userList, userFilter);

    }
}
