package org.desgnpatterns.solid.srp;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Invoice {
    private long id;
    private long orderId;
    private BigDecimal amount;
    private BigDecimal tax;
    private String customerEmail;
    private String status;
}
