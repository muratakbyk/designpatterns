package org.desgnpatterns.solid.lsp.badcode;

import java.util.logging.Logger;

public class Bird {
    Logger logger = Logger.getLogger(Bird.class.getName());
    public void fly() {
        // logic here
        logger.info("flying ..");
    }
}
