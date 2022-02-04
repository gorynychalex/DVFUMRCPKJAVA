package ru.dvfu.mrcpk.java01.example11.easyclass;

public abstract class GeometryShape {
    protected Point2d point;
    private String color;

    public abstract double perimeter();
    public abstract double square();

    public abstract void draw();

    @Override
    public String toString() {
        return "Объект базового класса";
    }
}
