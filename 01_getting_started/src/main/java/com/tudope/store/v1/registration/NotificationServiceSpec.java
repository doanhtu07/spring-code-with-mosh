package com.tudope.store.v1.registration;

public interface NotificationServiceSpec {
    void send(String message, String recipientEmail);
}
