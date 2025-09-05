package com.tudope.store.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "profiles")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Profile {
    @Id
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

    @OneToOne
    @JoinColumn(name = "id")
    @MapsId
    @ToString.Exclude
    private User user;
}
