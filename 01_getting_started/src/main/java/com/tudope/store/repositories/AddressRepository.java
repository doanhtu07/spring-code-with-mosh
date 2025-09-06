package com.tudope.store.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tudope.store.entities.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
