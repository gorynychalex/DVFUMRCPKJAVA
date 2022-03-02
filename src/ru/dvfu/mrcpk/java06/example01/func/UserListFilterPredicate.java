package ru.dvfu.mrcpk.java06.example01.func;

import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
public interface UserListFilterPredicate {
    List<User> test(List<User> users, Predicate<User> predicate);
}
