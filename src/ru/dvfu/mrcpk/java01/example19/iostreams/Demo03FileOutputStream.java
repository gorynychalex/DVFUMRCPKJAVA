package ru.dvfu.mrcpk.java01.example19.iostreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Demo03FileOutputStream {
    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("/home/gorynych/java/file03.txt");

        String s = "И стоит берёза\n" +
                "В сонной тишине,\n" +
                "И горят снежинки\n" +
                "В золотом огне.\n";

        fileOutputStream.write(s.getBytes(StandardCharsets.UTF_8));

        fileOutputStream.close();
    }
}
