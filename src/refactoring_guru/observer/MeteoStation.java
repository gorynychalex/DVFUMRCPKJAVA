package refactoring_guru.observer;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observable{

    private int temperature;
    private int pressure;

    List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(x->{
            x.handleEvent(this.temperature,this.pressure);
        });
    }

    @Override
    public void setParams(int p1, int p2) {
        this.temperature = p1;
        this.pressure = p2;
        notifyObservers();
    }
}
