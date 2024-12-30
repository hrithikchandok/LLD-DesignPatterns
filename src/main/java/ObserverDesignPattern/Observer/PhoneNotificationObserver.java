package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.Observable;

public class PhoneNotificationObserver implements Observer {

    private  String PhoneNo;
    private Observable observable;
    public PhoneNotificationObserver(String PhoneNo, Observable observable) {
        this.PhoneNo = PhoneNo;
        this.observable = observable;
        observable.addObserver(this);

    }

    @Override
    public void update() {
        sendNotification(PhoneNo,"otp send to Phone NO");
    }

    private void sendNotification(String phoneNo, String otpSendToPhoneNo) {

        System.out.println(otpSendToPhoneNo+phoneNo);
    }
}
