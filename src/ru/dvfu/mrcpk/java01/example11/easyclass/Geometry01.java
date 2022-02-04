package ru.dvfu.mrcpk.java01.example11.easyclass;

public class Geometry01 {
    public static void main(String[] args) {

//        GeometryShape geometryShape = new GeometryShape();

        GeometryShape rectangle1 = new Rectangle(10);
        System.out.println("Прямоугольник:");
        System.out.println(rectangle1.point.getX());
        System.out.println(rectangle1.point.getY());
    }
}
