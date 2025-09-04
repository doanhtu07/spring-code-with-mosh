package com.tudope.store.v1.registration;

import java.util.Optional;

public interface UserRepositorySpec {
    void save(User user);

    Optional<User> findByEmail(String email);
}
