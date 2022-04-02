package refactoring_guru.observer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileObserver implements Observer {

    @Override
    public void handleEvent(int temp, int pressure) {
        File file;
        try {
            file = File.createTempFile("TempPressure", "_txt");
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.print("The weather changed: temp = " + temp + " , pressure = " + pressure);
            printWriter.println();
            printWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
