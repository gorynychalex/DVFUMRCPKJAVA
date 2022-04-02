package refactoring_guru.observer;

//Интерфейс наблюдаемого объекта
public interface Observable {
    //Добавить наблюдателя
    void addObserver(Observer o);

    //Удалить наблюдателя
    void removeObserver(Observer o);

    //Уведомить наблюдателей
    void notifyObservers();

    //Установка параметров
    void setParams(int p1, int p2);
}
