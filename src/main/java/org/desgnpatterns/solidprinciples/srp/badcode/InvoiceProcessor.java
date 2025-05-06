package org.desgnpatterns.solidprinciples.srp.badcode;

import org.desgnpatterns.solidprinciples.srp.Invoice;
import org.desgnpatterns.solidprinciples.srp.Order;

import java.math.BigDecimal;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class InvoiceProcessor {
    private static final Logger logger = Logger.getLogger(InvoiceProcessor.class.getName());
    public void processInvoice(Order order){
        try {
            Invoice invoice = createInvoiceCalculateTaxAndSaveToDatabase(order);

            //async notification
            ExecutorService executor = Executors.newSingleThreadExecutor();

            executor.submit(() -> {
                try {
                    sendEmail(invoice);
                } catch (Exception e) {
                    retrySendEmail(invoice);
                }
            });
            logger.info("Invoice processed succesfully.");
        } catch (Exception e) {
            logger.info("Error occured: " + e.getMessage());
            sendFailureNotificationToUser(order);
        }
    }

    public Invoice createInvoiceCalculateTaxAndSaveToDatabase(Order order){
        Invoice invoice = new Invoice();
        // invoice creation logic here
        invoice.setOrderId(order.getOrderId());
        // ..
        // tax calculation logic here
        // ..
        BigDecimal tax = new BigDecimal(1);
        invoice.setTax(tax);
        // database insertion logic here
        // ..
        return invoice;
    }

    public void sendEmail(Invoice invoice){
        logger.info("Sending mail ..");
    }

    public void retrySendEmail(Invoice invoice){
        logger.info("Retrying to send mail ..");
    }

    public void sendFailureNotificationToUser(Order order){
        logger.info("Sending notification ..");
    }
}
