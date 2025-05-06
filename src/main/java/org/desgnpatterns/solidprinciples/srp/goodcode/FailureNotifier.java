package org.desgnpatterns.solidprinciples.srp.goodcode;


import org.desgnpatterns.solidprinciples.srp.Order;

import java.util.logging.Logger;

public class FailureNotifier {
    private static final Logger logger = Logger.getLogger(FailureNotifier.class.getName());

    public void notifyUser(Order order) {
        logger.info("Failed to process invoice for order: " + order.getOrderId());
            // logic here
    }
}

