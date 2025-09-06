package com.tudope.store.v1.registration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RegistrationConfig {
    @Bean
    public UserService userServiceV1() {
        return new UserService(userRepositoryV1(), notificationService());
    }

    @Bean
    public UserRepositorySpec userRepositoryV1() {
        return new InMemoryUserRepository();
    }

    @Bean
    public NotificationServiceSpec notificationService() {
        return new EmailNotificationService();
    }
}
