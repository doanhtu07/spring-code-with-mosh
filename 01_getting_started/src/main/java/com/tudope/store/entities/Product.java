package com.tudope.store.entities;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false, name = "id")
  private long id;

  @Column(nullable = false, name = "name")
  private String name;

  @Column(nullable = false, precision = 10, scale = 2, name = "price")
  private BigDecimal price;

  @Column(nullable = true, insertable = false, updatable = false, name = "category_id")
  private byte categoryId;

  @ManyToOne
  @JoinColumn(name = "category_id")
  private Category category;

  @ManyToMany
  @JoinTable(name = "wishlists", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
  private Set<User> wishlistUsers = new HashSet<>();
}
