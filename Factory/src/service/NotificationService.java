package service;

import factory.NotificationFactory;
import notification.Notification;


public class NotificationService {

    private NotificationFactory factory;

    public NotificationService(NotificationFactory factory) {
        this.factory = factory;
    }

    public void notifyUser(String type, String recipient, String message) {
        Notification notification = factory.createNotification(type);
        notification.send(recipient, message);
    }
}