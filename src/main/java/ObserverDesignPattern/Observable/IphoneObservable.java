package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements Observable {
    List<Observer> list_of_observers=new ArrayList<>();
    int stock=0;
    @Override
    public void addObserver(Observer observer) {
        list_of_observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
   list_of_observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
         for(Observer observer : list_of_observers) {
             if(stock==0)
                 observer.update();
         }
    }

    @Override
    public void setData(int newStockAdded) {
        if(stock==0)
            {
                notifyObservers();
                stock=newStockAdded;
            }
        else
        stock=stock+newStockAdded;
    }

    @Override
    public int getData() {
        return stock;
    }
}
