package refactoring_guru.observer;

public class ConsoleObserver implements Observer{
    @Override
    public void handleEvent(int temp, int pressure) {
        System.out.println("The weather changed: temp = " + temp + " , pressure = " + pressure);
    }
}
