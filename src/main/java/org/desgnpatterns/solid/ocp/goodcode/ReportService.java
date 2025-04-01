package org.desgnpatterns.solid.ocp.goodcode;

public class ReportService {

    public void generateReport(ReportGenerator generator){
        generator.generate();
    }
}
