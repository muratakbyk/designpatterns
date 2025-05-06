package org.desgnpatterns.solidprinciples.srp.goodcode;

import org.desgnpatterns.solidprinciples.srp.Order;

import java.math.BigDecimal;

public class TaxCalculator {

    public BigDecimal calculate(Order order){
        // logic here
        return new BigDecimal(1);
    }
}
