package Alignement;
//représente le subject de le design pattern observer
public interface Data {

    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();
}
