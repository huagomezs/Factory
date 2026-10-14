package notification;


public class WhatsAppNotification implements Notification {
    @Override
    public void send(String recipient, String message) {
        System.out.println("[WHATSAPP] Sending to " + recipient + ": " + message);
    }
}