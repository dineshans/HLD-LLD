package com.app.observeddesignpatter;

import com.app.observeddesignpatter.observable.IphoneObservableImpl;
import com.app.observeddesignpatter.observable.StocksObservable;
import com.app.observeddesignpatter.observer.EmailNotificationObserverImpl;
import com.app.observeddesignpatter.observer.MobileNotificationAlertObserverImpl;
import com.app.observeddesignpatter.observer.NotificationAlertObserver;

public class MainTest {

    public static void main(String[] args) {

        StocksObservable iphoneObservable = new IphoneObservableImpl();

        NotificationAlertObserver notificationAlertObserver1 = new EmailNotificationObserverImpl("xyz@gmail.com", iphoneObservable);
        NotificationAlertObserver notificationAlertObserver2 = new EmailNotificationObserverImpl("abc@gmail.com", iphoneObservable);
        NotificationAlertObserver notificationAlertObserver3 = new MobileNotificationAlertObserverImpl("xyz_dinesh", iphoneObservable);

        iphoneObservable.add(notificationAlertObserver1);
        iphoneObservable.add(notificationAlertObserver2);
        iphoneObservable.add(notificationAlertObserver3);

        iphoneObservable.setData(10);
    }

}
