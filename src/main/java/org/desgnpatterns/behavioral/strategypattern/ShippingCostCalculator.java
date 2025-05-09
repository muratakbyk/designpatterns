package org.desgnpatterns.behavioral.strategypattern;

public class ShippingCostCalculator {
    private ShippingStrategy shippingStrategy;

    public ShippingCostCalculator(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public double calculateCost (double weightInKg) {
        return shippingStrategy.calculate(weightInKg);
    }
}
