package org.desgnpatterns.solid.srp.goodcode;

import org.desgnpatterns.solid.srp.Invoice;
import org.desgnpatterns.solid.srp.Order;

import java.math.BigDecimal;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InvoiceProcessor {

    private final InvoiceGenerator invoiceGenerator;
    private final TaxCalculator taxCalculator;
    private final InvoiceRepository invoiceRepository;
    private final EmailSender emailSender;
    private final RetryHandler retryHandler;
    private final FailureNotifier failureNotifier;

    public InvoiceProcessor(
            InvoiceGenerator invoiceGenerator,
            TaxCalculator taxCalculator,
            InvoiceRepository invoiceRepository,
            EmailSender emailSender,
            RetryHandler retryHandler,
            FailureNotifier failureNotifier) {
        this.invoiceGenerator = invoiceGenerator;
        this.taxCalculator = taxCalculator;
        this.invoiceRepository = invoiceRepository;
        this.emailSender = emailSender;
        this.retryHandler = retryHandler;
        this.failureNotifier = failureNotifier;
    }

    public void processInvoice(Order order) {
        try {
            Invoice invoice = invoiceGenerator.generate(order);
            BigDecimal tax = taxCalculator.calculate(order);
            invoice.setTax(tax);
            invoiceRepository.save(invoice);

            ExecutorService executor = Executors.newSingleThreadExecutor();
            executor.submit(() -> retryHandler.retry(() -> emailSender.sendEmail(invoice)));
            executor.shutdown();

        } catch (Exception e) {
            failureNotifier.notifyUser(order);
        }
    }
}

