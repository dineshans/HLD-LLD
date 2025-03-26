package com.app.observeddesignpatter.observer;

import com.app.observeddesignpatter.observable.StocksObservable;

public class EmailNotificationObserverImpl implements NotificationAlertObserver{

    StocksObservable observable;
    String email;

    public EmailNotificationObserverImpl(String email, StocksObservable observable) {
        this.observable = observable;
        this.email = email;
    }

    @Override
    public void update() {
        sendEmail(email, "product is in stock!!!!");
    }

    private void sendEmail(String email, String msg) {

        System.out.println("email sent to : " + email);

    }
}
