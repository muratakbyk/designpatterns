package org.desgnpatterns.solid.ocp.goodcode;

import java.util.logging.Logger;

public class ExcelGenerator implements ReportGenerator{
    Logger logger = Logger.getLogger(ExcelGenerator.class.getName());

    @Override
    public void generate() {
        // logic here
        logger.info("Generating excel report..");

    }
}
