package ru.dvfu.mrcpk.java06.example01.func;

/**
 * Объектно-ориентированный и имеративный способ фильтрации
 * по параметру
 *
 * Java > 8 (1.8)
 *
 * С использованием интерфейса Predicate<T>
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main02
{
    public static void main(String[] args) {

        // Создание пользователей
        User user1 = new User("Вася","Пупкин", 30);
        User user2 = new User("Коля","Иванов", 19);
        User user3 = new User("Петя","Сидоров", 40);

        // Создание списка пользователей
        List<User> userList = new ArrayList<>(){{add(user1);add(user2); add(user3);}};

        // Создание объекта фильтрации с предикатом
        UserListFilterPredicate filterPredicate = new UserListFilterPredicate() {
            List<User> filteredList = new ArrayList<>();
            @Override
            public List<User> test(List<User> users, Predicate<User> predicate) {
                for(User user: users){
                    if(predicate.test(user)){
                        filteredList.add(user);
                        System.out.println(user);
                    }
                }
                return filteredList;
            }
        };


        // Создание предиката
        Predicate<User> predicate = new Predicate<User>() {
            @Override
            public boolean test(User user) {
                return user.getAge() >= 18;
            }
        };

        System.out.println("Фильтрованный список через явный предикат - new Predicate<User>: ");
        // Фильтрация объектов по параметру, указанному через явно созданный предикат
        filterPredicate.test(userList, predicate);

        System.out.println();

        System.out.println("Фильтрованный список через лябда-предикат -  (user -> user.getAge() >= 20): ");
        // Фильтрация объектов по параметру, указанному через предикат, созданный лямбда-функцией
        filterPredicate.test(userList, user -> user.getAge() >= 20);
    }
}