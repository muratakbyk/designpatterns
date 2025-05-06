package org.desgnpatterns.solidprinciples.srp.goodcode;

import org.desgnpatterns.solidprinciples.srp.Invoice;
import org.desgnpatterns.solidprinciples.srp.Order;

public class InvoiceGenerator {

    public Invoice generate (Order order){
        // logic here
        return new Invoice();
    }
}
