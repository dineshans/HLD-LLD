package com.app.observeddesignpatter.observer;

import com.app.observeddesignpatter.observable.StocksObservable;

public class MobileNotificationAlertObserverImpl implements NotificationAlertObserver {

    StocksObservable observable;
    String userName;

    public MobileNotificationAlertObserverImpl(String userName, StocksObservable observable) {
        this.observable = observable;
        this.userName = userName;
    }

    @Override
    public void update() {
        sendOnMobile(userName, "Product is available!!!!");
    }

    private void sendOnMobile(String userName, String msg) {
        System.out.println("message sent to :" + userName);
    }
}
