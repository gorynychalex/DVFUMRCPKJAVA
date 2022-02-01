package ru.dvfu.mrcpk.java01.example11.easyclass;

public class Point2dUse {
    public static void main(String[] args) {
        Point2d point2d = new Point2d();
        Point2d point1 = new Point2d(1,2);
        Point2d point2 = new Point2d(0);

        System.out.println("Точка 1: ("
                + point1.getX() + ", " + point1.getY() + ");"
        );
        System.out.println("Точка 2: ("
                + point2.getX() + ", " + point2.getY() + ");"
        );
        point1.setX(10); point1.setY(20);
        System.out.println("Точка 1: ("
                + point1.getX() + ", " + point1.getY() + ");"
        );
    }
}
