package org.desgnpatterns.solidprinciples.lsp.goodcode;


import java.util.logging.Logger;

public class FlyBird {
    Logger logger = Logger.getLogger(FlyBird.class.getName());
    void eat(){
        // logic here
        logger.info("eating .. ");
    }

    void fly(){
        // logic here
        logger.info("flying ..");
    }
}
