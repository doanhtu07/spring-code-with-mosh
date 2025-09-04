package com.tudope.store.v1.notification;

import org.springframework.stereotype.Service;

@Service
public class NotificationManager {
    private final NotificationServiceSpec notificationService;

    public NotificationManager(NotificationServiceSpec notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotification(String message) {
        notificationService.sendMessage(message);
    }
}
