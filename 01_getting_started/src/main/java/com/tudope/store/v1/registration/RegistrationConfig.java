package com.tudope.store.v1.registration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RegistrationConfig {
    @Bean
    public UserService userService() {
        return new UserService(userRepository(), notificationService());
    }

    @Bean
    public UserRepositorySpec userRepository() {
        return new InMemoryUserRepository();
    }

    @Bean
    public NotificationServiceSpec notificationService() {
        return new EmailNotificationService();
    }
}
