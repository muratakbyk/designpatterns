package org.desgnpatterns.creational.factorypattern;

public class NotificationFactory {

    public Notification createNotifier(NotifierEnum notifierType){

        if (notifierType == NotifierEnum.EMAIL) {
            return new EmailNotifier();
        }

        else if (notifierType == NotifierEnum.SMS) {
            return new SmsNotifier();
        }

        return null;
    }
}
