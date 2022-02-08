package ru.dvfu.mrcpk.java01.example19.iostreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * FileReader & FileWriter - адаптеры между File и интерфейсами InputStream, OutputStream, Reader, Writer
 */
public class Demo05FileReaderWriter {
    public static void main(String[] args) throws IOException {

        FileReader[] fileReaders = new FileReader[] {
                new FileReader("/home/gorynych/java/file01.txt"),
                new FileReader("/home/gorynych/java/file02.txt"),
                new FileReader("/home/gorynych/java/file03.txt"),
                new FileReader("/home/gorynych/java/file04.txt"),
        };

        FileWriter fileWriter = new FileWriter("/home/gorynych/java/file05.txt");

        for(FileReader fileReader: fileReaders) {
            while (fileReader.ready()) {
                int data = fileReader.read();
                fileWriter.write(data);
            }
            fileWriter.write("\n");
            fileReader.close();
        }

        fileWriter.close();
    }
}
