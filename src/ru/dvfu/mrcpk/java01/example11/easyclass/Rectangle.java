package ru.dvfu.mrcpk.java01.example11.easyclass;

public class Rectangle {
    int a;
    int b;
    Point2d point;

    public Rectangle(int a) {
        this.a = a; this.b = a;
        this.point = new Point2d(0,0);
    }

    public Rectangle(int a, int b, Point2d point) {
        this.a = a;
        this.b = b;
        this.point = point;
    }

}
