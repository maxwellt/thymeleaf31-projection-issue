package com.example.thymeleafprojectionissue;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

  @Id
  private Integer id;

  private String name;

  protected Product() {}

  public Product(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
