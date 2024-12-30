package ObserverDesignPattern;

import ObserverDesignPattern.Observable.IphoneObservable;
import ObserverDesignPattern.Observable.Observable;
import ObserverDesignPattern.Observer.EmailNotificationObserver;
import ObserverDesignPattern.Observer.Observer;
import ObserverDesignPattern.Observer.PhoneNotificationObserver;

public class Store {
    public static void main(String[] args){
        Observable iphoneObservable=new IphoneObservable();
        Observer observer1=new PhoneNotificationObserver("7017262926",iphoneObservable);
        Observer observer=new EmailNotificationObserver(iphoneObservable, "hrithikchandok00@gmail.com");

//        which method is good to add here only or to add in the object creation of the observer only
//        iphoneObservable.addObserver(observer1);
//        iphoneObservable.addObserver(observer);



        iphoneObservable.setData(10);


    }
}
