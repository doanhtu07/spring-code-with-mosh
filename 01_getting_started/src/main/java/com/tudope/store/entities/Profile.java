package com.tudope.store.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "profiles")
@Getter
@Setter
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "id")
    private Long id;

    @Column(nullable = true, name = "bio")
    private String bio;

    @Column(nullable = true, name = "phone_number")
    private String phoneNumber;

    @Column(nullable = true, name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(nullable = true, name = "loyalty_points")
    private Integer loyaltyPoints;
}
