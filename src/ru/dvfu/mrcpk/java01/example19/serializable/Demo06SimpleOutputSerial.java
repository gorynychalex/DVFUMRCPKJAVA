package ru.dvfu.mrcpk.java01.example19.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo06SimpleOutputSerial {
    public static void main(String[] args) throws Exception {

        CarSaveLoad carSaveLoad = new CarSaveLoad("Audi",10);
        carSaveLoad.setType("sedan");
        carSaveLoad.setColor("black");

        FileOutputStream fileOutputStream = new FileOutputStream("/home/gorynych/java/carSaveLoad1.txt");

        carSaveLoad.save(fileOutputStream);

        fileOutputStream.close();

    }

}
