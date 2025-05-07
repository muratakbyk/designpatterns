package org.desgnpatterns.structural.adapterpattern;

public class LegacyBankAdapter implements PaymentGateway{
    private final LegacyBankApi legacyBankApi;
    public LegacyBankAdapter(LegacyBankApi legacyBankApi){
        this.legacyBankApi = legacyBankApi;
    }
    @Override
    public void pay() {
        legacyBankApi.makePayment();
    }
}
