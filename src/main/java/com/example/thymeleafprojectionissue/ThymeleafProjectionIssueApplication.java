package com.example.thymeleafprojectionissue;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ThymeleafProjectionIssueApplication implements CommandLineRunner {

  private final ProductRepository productRepository;

  public ThymeleafProjectionIssueApplication(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(ThymeleafProjectionIssueApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    List<Product> products = List.of(new Product(1, "Product #1"), new Product(2, "Product #2"), new Product(3, "Product #3"));
    this.productRepository.saveAll(products);
  }
}
