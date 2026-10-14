package app;

import factory.NotificationFactory;
import service.NotificationService;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        NotificationService service = new NotificationService(factory);

        service.notifyUser("email", "john@mail.com", "Welcome to our app");
        service.notifyUser("sms", "300 123 4567", "Your code is 4821");
        service.notifyUser("whatsapp", "311 765 4321", "Your order has been shipped");
    }
}