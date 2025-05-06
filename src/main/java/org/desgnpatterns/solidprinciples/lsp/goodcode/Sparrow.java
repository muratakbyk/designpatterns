package org.desgnpatterns.solidprinciples.lsp.goodcode;

import java.util.logging.Logger;

public class Sparrow extends FlyBird{
    Logger logger = Logger.getLogger(Sparrow.class.getName());
    @Override
    public void eat() {
        logger.info("Sparrow is eating.");
    }

    @Override
    public void fly() {
        logger.info("Sparrow is flying.");
    }
}
