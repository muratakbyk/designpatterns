package org.desgnpatterns.creational.factorypattern;

public class Application {
    public static void main(String args[]){
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotifier(NotifierEnum.EMAIL);
        notification.sendNotification("Example message");
    }
}
