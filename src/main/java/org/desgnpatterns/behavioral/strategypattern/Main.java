package org.desgnpatterns.behavioral.strategypattern;

public class Main {
    public static void main(String[] args) {
        ShippingCostCalculator calculator;

        calculator = new ShippingCostCalculator(new FedExShipping());
        System.out.println("FedEx: " + calculator.calculateCost(5));

        calculator = new ShippingCostCalculator(new UPSShipping());
        System.out.println("UPS: " + calculator.calculateCost(5));

        calculator = new ShippingCostCalculator(new DHLShipping());
        System.out.println("DHL: " + calculator.calculateCost(5));
    }
}
