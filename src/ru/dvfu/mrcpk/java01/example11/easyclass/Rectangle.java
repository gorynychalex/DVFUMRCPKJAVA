package ru.dvfu.mrcpk.java01.example11.easyclass;

import java.io.Serializable;

public class Rectangle extends GeometryShape implements GeometryMove, Serializable {
    int a;
    int b;

    public Rectangle(int a) {
        this.a = a; this.b = a;
        this.point = new Point2d(0,0);
    }

    public Rectangle(int a, int b, Point2d point) {
        this.a = a;
        this.b = b;
        this.point = point;
    }

    @Override
    public double perimeter() {
        return 2*(this.a+this.b);
    }

    @Override
    public double square() {
        return this.a*this.b;
    }

    @Override
    public void draw() {

        System.out.println("Рисуем прямоугольник");

    }

    @Override
    public void moveTo(int x, int y) {

    }
}
