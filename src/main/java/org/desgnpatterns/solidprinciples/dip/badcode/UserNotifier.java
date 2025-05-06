package org.desgnpatterns.solidprinciples.dip.badcode;

public class UserNotifier {
    EmailService emailService = new EmailService();
    public void notifyUser(String userMail){
        emailService.sendEmail(userMail);
    }
}
