package org.desgnpatterns.solidprinciples.isp.badcode;

import java.util.logging.Logger;

public class MultiFunctionPrinter implements Document{
    Logger logger = Logger.getLogger(MultiFunctionPrinter.class.getName());
    @Override
    public void print() {
        // logic here
        logger.info("Printing ..");
    }

    @Override
    public void fax() {
        // logic here
        logger.info("Faxing ..");

    }

    @Override
    public void scan() {
        // logic here
        logger.info("Scanning ..");

    }
}
