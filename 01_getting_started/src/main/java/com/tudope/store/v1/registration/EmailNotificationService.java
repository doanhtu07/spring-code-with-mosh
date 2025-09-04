package com.tudope.store.v1.registration;

import org.springframework.beans.factory.annotation.Value;

public class EmailNotificationService implements NotificationServiceSpec {
    @Value("${email-service.host}")
    private String host;

    @Value("${email-service.port}")
    private int port;

    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("=== === ===");
        System.out.println("Host: " + host);
        System.out.println("Port: " + port);
        System.out.println("Recipient: " + recipientEmail);
        System.out.println("Message: " + message);
        System.out.println("=== === ===");
    }
}
