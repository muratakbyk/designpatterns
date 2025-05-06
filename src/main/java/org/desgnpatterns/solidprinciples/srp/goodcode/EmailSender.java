package org.desgnpatterns.solidprinciples.srp.goodcode;

import org.desgnpatterns.solidprinciples.srp.Invoice;

import java.util.logging.Logger;

public class EmailSender {
    private static final Logger logger = Logger.getLogger(EmailSender.class.getName());

    public void sendEmail(Invoice invoice){
        // logic here
        logger.info("Sending mail ..");
    }

}
