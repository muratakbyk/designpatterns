package org.desgnpatterns.solidprinciples.dip.goodcode;

import java.util.logging.Logger;

public class EmailService implements NotificationService{
    Logger logger = Logger.getLogger(EmailService.class.getName());

    @Override
    public void send(String userMail) {
        logger.info("Sending mail to: " + userMail);
        // logic here
    }
}
