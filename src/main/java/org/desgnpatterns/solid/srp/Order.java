package org.desgnpatterns.solid.srp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private long orderId;
    private String customerEmail;
    private double amount;

}
