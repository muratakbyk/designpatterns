package org.desgnpatterns.solid.dip.badcode;

import java.util.logging.Logger;

public class EmailService {
    Logger logger = Logger.getLogger(EmailService.class.getName());
    public void sendEmail(String userMail){
        logger.info("Sending mail to: " + userMail);
        // logic here
    }
}
