package com.app.observeddesignpatter.observable;

import com.app.observeddesignpatter.observer.NotificationAlertObserver;

public interface StocksObservable {

    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifySubscriber();
    void setData(int stock);
    int getDate();
}
