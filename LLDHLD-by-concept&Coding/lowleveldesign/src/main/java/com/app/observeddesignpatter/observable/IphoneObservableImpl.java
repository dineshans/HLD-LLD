package com.app.observeddesignpatter.observable;

import com.app.observeddesignpatter.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable {

    List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscriber() {

        for (NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setData(int newStock) {

        if (stockCount == 0) {
            notifySubscriber();
        }
        stockCount += newStock;
    }

    @Override
    public int getDate() {

        return stockCount;
    }
}
