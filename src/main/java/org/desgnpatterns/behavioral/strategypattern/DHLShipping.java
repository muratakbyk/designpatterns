package org.desgnpatterns.behavioral.strategypattern;

public class DHLShipping implements ShippingStrategy{
    private final static double DHLShippingFee = 10;
    private final static double DHLKgFee = 1.5;
    @Override
    public double calculate(double weightInKg) {
        return DHLShippingFee + weightInKg * DHLKgFee;
    }
}
