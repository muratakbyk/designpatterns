package org.desgnpatterns.creational.factorypattern;

public class EmailNotifier implements Notification{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending e mail notification : " + message);
    }
}
