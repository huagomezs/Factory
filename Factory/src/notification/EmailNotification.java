package notification;


public class EmailNotification implements Notification {
    @Override
    public void send(String recipient, String message) {
        System.out.println("[EMAIL] Sending to " + recipient + ": " + message);
    }
}