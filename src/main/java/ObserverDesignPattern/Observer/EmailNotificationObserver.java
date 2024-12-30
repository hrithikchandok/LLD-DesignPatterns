package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.Observable;

public class EmailNotificationObserver implements Observer {

    private Observable observable;
    private String EmailId;
    public EmailNotificationObserver(Observable observable, String EmailId) {
        this.observable = observable;
        this.EmailId = EmailId;
        observable.addObserver(this);

    }

    @Override
    public void update() {
        sendEmail(EmailId,"This is email Notification Iphone is back in Stock");
    }

    private void sendEmail(String emailId, String s) {
         System.out.println("Mail Send over Email to EmailId"+emailId);
    }
}
