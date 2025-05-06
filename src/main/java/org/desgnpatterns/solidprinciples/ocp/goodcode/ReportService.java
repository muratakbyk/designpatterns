package org.desgnpatterns.solidprinciples.ocp.goodcode;

public class ReportService {

    public void generateReport(ReportGenerator generator){
        generator.generate();
    }
}
