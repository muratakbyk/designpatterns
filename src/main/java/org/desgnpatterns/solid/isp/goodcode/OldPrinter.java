package org.desgnpatterns.solid.isp.goodcode;

import java.util.logging.Logger;

public class OldPrinter implements Printable{
    Logger logger = Logger.getLogger(OldPrinter.class.getName());
    @Override
    public void print() {
        // logic here
        logger.info("Printing..");
    }
}
