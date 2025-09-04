package com.tudope.store.v1.registration;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InMemoryUserRepository implements UserRepositorySpec {
    private Map<String, User> users = new HashMap<>(); // email -> user

    @Override
    public void save(User user) {
        users.put(user.getEmail(), user);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.ofNullable(users.get(email));
    }
}
