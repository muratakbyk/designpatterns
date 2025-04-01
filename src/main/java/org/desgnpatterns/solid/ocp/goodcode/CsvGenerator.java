package org.desgnpatterns.solid.ocp.goodcode;

import java.util.logging.Logger;

public class CsvGenerator implements ReportGenerator{
    Logger logger = Logger.getLogger(CsvGenerator.class.getName());

    @Override
    public void generate() {
        // logic here
        logger.info("Generating CSV report..");
    }
}
