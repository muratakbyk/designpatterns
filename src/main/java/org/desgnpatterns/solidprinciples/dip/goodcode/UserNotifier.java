package org.desgnpatterns.solidprinciples.dip.goodcode;

public class UserNotifier {
    private final NotificationService notificationService;

    public UserNotifier(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String userMail){
        notificationService.send(userMail);
    }
}
