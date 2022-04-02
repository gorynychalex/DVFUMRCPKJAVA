package refactoring_guru.observer;

public class Main {
    public static void main(String[] args) {
        Observable station1 = new MeteoStation();
        Observer observer1 = new ConsoleObserver();
        Observer observer2 = new FileObserver();

        station1.addObserver(observer1);
        station1.addObserver(observer2);
        station1.addObserver(new ConsoleObserver());
        station1.setParams(25, 760);
    }
}
