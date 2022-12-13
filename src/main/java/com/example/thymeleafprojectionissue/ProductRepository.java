package com.example.thymeleafprojectionissue;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

  <T> List<T> findAllProjectedBy(Class<T> clazz);
}
