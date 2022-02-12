package ru.dvfu.mrcpk.java01.example13.generics;

public class OptionalDemo<T extends Number> {
    T value;

    public OptionalDemo() {
    }

    public OptionalDemo(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if(value == null) return null;
        return value.getClass().getName() + " " + value;
    }
}
