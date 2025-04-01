package org.desgnpatterns.solid.isp.badcode;

import java.util.logging.Logger;

public class OldPrinter implements Document{
    Logger logger = Logger.getLogger(OldPrinter.class.getName());

    @Override
    public void print() {
        logger.info("Printing ..");
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException("Fax not supported");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("Scan not supported");
    }
}
