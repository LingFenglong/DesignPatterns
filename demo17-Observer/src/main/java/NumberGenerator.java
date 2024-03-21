import java.util.ArrayList;

public abstract class NumberGenerator {
    private final ArrayList<Observer> observers = new ArrayList<>();
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        this.observers.forEach(observer -> observer.update(this));
    }

    public abstract int getNumber();
    public abstract void execute();
}
