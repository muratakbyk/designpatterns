package org.desgnpatterns.solidprinciples.ocp.badcode;

public class ReportService {

    public void generateReport(String reportType) {
        if (reportType.equals("pdf")) {
            // logic here
        } else if (reportType.equals("excel")) {
            // logic here
        } else if (reportType.equals("csv")) {
            // logic here
        } else {
            throw new IllegalArgumentException("Unsupported report type");
        }
    }
}

