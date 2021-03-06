package ru.dvfu.mrcpk.java01.example19.serializable;

import java.io.*;

public class Demo08SerialOutput {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CarSerial car = new CarSerial("BMW", 10);
        car.setColor("white");
        car.setType("crossover");

        FileOutputStream fileOutputStream = new FileOutputStream("/home/gorynych/java/carserial.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(car);

        objectOutputStream.close();
        fileOutputStream.close();
    }
}
