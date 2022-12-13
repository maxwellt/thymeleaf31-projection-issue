package com.example.thymeleafprojectionissue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ProductController {

  private final Logger logger = LoggerFactory.getLogger(ProductController.class);

  private final ProductRepository productRepository;

  public ProductController(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @GetMapping("/")
  public String index(Model model) {
    List<ProductProjection> products = this.productRepository.findAllProjectedBy(ProductProjection.class);

    String productsString = products.stream()
        .map(ProductProjection::getName)
        .collect(Collectors.joining(", "));
    logger.info("returning products: {}", productsString);

    model.addAttribute("products", products);

    return "index";
  }
}
