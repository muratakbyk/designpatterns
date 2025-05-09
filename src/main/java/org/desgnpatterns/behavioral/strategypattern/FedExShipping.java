package org.desgnpatterns.behavioral.strategypattern;

public class FedExShipping implements ShippingStrategy{
    private final static double fedExShippingFee = 10;
    private final static double fedExKgFee = 1.5;

    @Override
    public double calculate(double weightInKg) {
        return fedExShippingFee + weightInKg * fedExKgFee;
    }
}
