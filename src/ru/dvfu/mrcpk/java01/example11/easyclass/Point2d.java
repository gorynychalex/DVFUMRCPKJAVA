package ru.dvfu.mrcpk.java01.example11.easyclass;

public class Point2d {
    private int x, y;

    public Point2d(){}

    public Point2d(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point2d(int x) {
        this.x = x; this.y = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
