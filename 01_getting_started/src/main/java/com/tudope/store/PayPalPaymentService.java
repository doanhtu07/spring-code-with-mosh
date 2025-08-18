package com.tudope.store;

import org.springframework.stereotype.Service;

// @Service("paypal")
public class PayPalPaymentService implements PaymentServiceSpec {
    @Override
    public void processPayment(double amount) {
        System.out.println("PAYPAL");
        System.out.println("Amount: " + amount);
    }
}
