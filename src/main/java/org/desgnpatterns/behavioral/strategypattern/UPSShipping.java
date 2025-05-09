package org.desgnpatterns.behavioral.strategypattern;

public class UPSShipping implements ShippingStrategy{
    private final static double UPSShippingFee = 10;
    private final static double UPSKgFee = 1.5;
    @Override
    public double calculate(double weightInKg) {
        return UPSShippingFee + weightInKg * UPSKgFee;
    }
}
