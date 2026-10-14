package factory;

import notification.EmailNotification;
import notification.Notification;
import notification.SmsNotification;
import notification.WhatsAppNotification;


public class NotificationFactory {

    public Notification createNotification(String type) {
        Notification notification = null;

        if (type.equalsIgnoreCase("email")) {
            notification = new EmailNotification();
        } else if (type.equalsIgnoreCase("sms")) {
            notification = new SmsNotification();
        } else if (type.equalsIgnoreCase("whatsapp")) {
            notification = new WhatsAppNotification();
        } else {
            throw new IllegalArgumentException("Unknown notification type: " + type);
        }

        return notification;
    }
}