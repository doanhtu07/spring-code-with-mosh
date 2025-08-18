package com.tudope.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${payment-service.type:stripe}")
    private String paymentServiceType;

    @Bean
    public PaymentServiceSpec stripe() {
        return new StripePaymentService();
    }

    @Bean
    public PaymentServiceSpec paypal() {
        return new PayPalPaymentService();
    }

    @Bean
    public OrderService orderService() {
        switch (paymentServiceType) {
            case "stripe":
                return new OrderService(stripe());
            case "paypal":
                return new OrderService(paypal());
            default:
                throw new IllegalStateException("Invalid payment service type");
        }
    }
}
