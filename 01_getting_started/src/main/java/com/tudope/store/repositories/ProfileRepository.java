package com.tudope.store.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tudope.store.entities.Profile;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}
