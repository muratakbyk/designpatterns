package org.desgnpatterns.solid.lsp.goodcode;

import java.util.logging.Logger;

public class Bird {
    Logger logger = Logger.getLogger(Bird.class.getName());

    void eat(){
        // logic here
        logger.info("eating .. ");
    }
}
