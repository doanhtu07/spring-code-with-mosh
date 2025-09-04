package com.tudope.store.v1.order;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

// @Service
public class OrderService {
    PaymentServiceSpec paymentService;

    public OrderService(
            // @Qualifier("stripe")
            PaymentServiceSpec paymentService) {
        System.out.println("OrderService Constructor");
        this.paymentService = paymentService;
    }

    @PostConstruct
    public void init() {
        System.out.println("OrderService PostConstruct");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("OrderService PreDestroy");
    }

    public void placeOrder() {
        paymentService.processPayment(10);
    }

    public void setPaymentService(PaymentServiceSpec paymentService) {
        this.paymentService = paymentService;
    }
}
