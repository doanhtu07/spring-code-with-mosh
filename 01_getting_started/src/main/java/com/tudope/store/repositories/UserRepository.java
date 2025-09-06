package com.tudope.store.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tudope.store.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
