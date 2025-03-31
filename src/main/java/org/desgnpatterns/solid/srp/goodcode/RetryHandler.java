package org.desgnpatterns.solid.srp.goodcode;

import java.util.logging.Logger;

public class RetryHandler {
    private static final Logger logger = Logger.getLogger(RetryHandler.class.getName());

    private static final int MAX_RETRIES = 3;

    public void retry(Runnable task) {
        int attempt = 0;
        while (attempt < MAX_RETRIES) {
            try {
                task.run();
                break;
            } catch (Exception e) {
                attempt++;
                logger.info("Retry attempt " + attempt + " failed.");
                if (attempt == MAX_RETRIES) {
                    logger.info("All retry attempts failed.");
                }
            }
        }
    }
}
