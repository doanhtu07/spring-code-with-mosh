package com.tudope.store.v1.registration;

public class UserService {
    private final UserRepositorySpec userRepository;
    private final NotificationServiceSpec notificationService;

    public UserService(UserRepositorySpec userRepository, NotificationServiceSpec notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    public void registerUser(User user) {
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new IllegalArgumentException("User " + user.getEmail() + " already exists");
        }

        userRepository.save(user);
        notificationService.send("Welcome to our service!", user.getEmail());
    }
}
