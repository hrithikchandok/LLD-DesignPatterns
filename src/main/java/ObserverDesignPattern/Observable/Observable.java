package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    void setData(int newStockAdded);
    int getData();

}
