package com.tudope.store.v1.notification;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService implements NotificationServiceSpec {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}
