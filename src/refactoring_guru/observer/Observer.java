package refactoring_guru.observer;

import java.io.IOException;

//Интерфейс наблюдателя
public interface Observer {
    //Обработка событий
    void handleEvent(int temp, int pressure) ;
}
