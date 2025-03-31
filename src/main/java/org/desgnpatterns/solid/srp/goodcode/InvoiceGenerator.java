package org.desgnpatterns.solid.srp.goodcode;

import org.desgnpatterns.solid.srp.Invoice;
import org.desgnpatterns.solid.srp.Order;

public class InvoiceGenerator {

    public Invoice generate (Order order){
        // logic here
        return new Invoice();
    }
}
