package org.desgnpatterns.creational.factorypattern;

public class SmsNotifier implements Notification{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending sms notification : " + message);
    }
}
