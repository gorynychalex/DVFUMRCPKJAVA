package ru.dvfu.mrcpk.java06.example01.func;

import java.util.List;

@FunctionalInterface
public interface UserFilter {

    boolean test(User user);
}
