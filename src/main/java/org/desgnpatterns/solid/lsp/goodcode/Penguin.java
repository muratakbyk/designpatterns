package org.desgnpatterns.solid.lsp.goodcode;

import java.util.logging.Logger;

public class Penguin extends Bird{
    Logger logger = Logger.getLogger(Penguin.class.getName());

    @Override
    public void eat(){
        logger.info("Penguin is eating ..");
    }
}
