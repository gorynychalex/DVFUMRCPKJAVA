package ru.dvfu.mrcpk.java06.example01.func;

import java.util.List;

@FunctionalInterface
public interface UserListFilter {
    List<User> test(List<User> users, UserFilter userFilter);
}
