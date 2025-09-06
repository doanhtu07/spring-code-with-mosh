package com.tudope.store.services;

import org.springframework.stereotype.Service;

import com.tudope.store.entities.Address;
import com.tudope.store.entities.User;
import com.tudope.store.repositories.AddressRepository;
import com.tudope.store.repositories.UserRepository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final AddressRepository addressRepository;
    private final EntityManager entityManager;

    @Transactional
    public void showEntityStates() {
        var user = User.builder()
                .name("John Doe")
                .email("john.doe@example.com")
                .password("securepassword")
                .build();

        if (entityManager.contains(user)) {
            System.out.println("Persistent");
        } else {
            System.out.println("Transient / Detached");
        }

        userRepository.save(user);

        if (entityManager.contains(user)) {
            System.out.println("Persistent");
        } else {
            System.out.println("Transient / Detached");
        }
    }

    @Transactional
    public void saveFirstAddress() {
        var address = Address.builder()
                .street("123 Main St")
                .city("Anytown")
                .zip("12345")
                .state("CA")
                .build();

        var user = userRepository.findById(2L).orElseThrow();

        if (user.getAddresses().isEmpty()) {
            user.addAddress(address);
            addressRepository.save(address);
        }
    }

    @Transactional
    public void fetchAddress() {
        var address = addressRepository.findById(1L).orElseThrow();
        System.out.println(address.getStreet());
    }

    @Transactional
    public void persistRelated() {
        var user = User.builder()
                .name("Jane Smith")
                .email("jane.smith@example.com")
                .password("anothersecurepassword")
                .build();

        var address = Address.builder()
                .street("456 Oak St")
                .city("Othertown")
                .zip("67890")
                .state("NY")
                .build();

        user.addAddress(address);

        userRepository.save(user);
        addressRepository.save(address);
    }

    @Transactional
    public void deleteRelated() {
        userRepository.deleteById(2L);
    }
}