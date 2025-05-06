package org.desgnpatterns.solidprinciples.ocp.goodcode;

import java.util.logging.Logger;

public class PdfGenerator implements ReportGenerator{
    Logger logger = Logger.getLogger(PdfGenerator.class.getName());
    @Override
    public void generate() {
        // logic here
        logger.info("Generating PDF report..");
    }
}
