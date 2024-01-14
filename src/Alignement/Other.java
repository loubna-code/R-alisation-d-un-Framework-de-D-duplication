package Alignement;


import java.util.ArrayList;
import java.util.List;

public class Other implements Data {
    private List<Observer> observers;
    private String state;

    public Other() {
        this.observers = new ArrayList<>();
        this.state = "";
    }

    // Getter et setter pour observers
    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    // Getter et setter pour state
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers(); // Notifie les observateurs lorsqu'il y a un changement d'état
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

