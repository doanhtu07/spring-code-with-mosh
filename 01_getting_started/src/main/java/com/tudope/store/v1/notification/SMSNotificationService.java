package com.tudope.store.v1.notification;

import org.springframework.stereotype.Service;

@Service("sms")
public class SMSNotificationService implements NotificationServiceSpec {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
