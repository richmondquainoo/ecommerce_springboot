package com.example.ecommerceproject.Product;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Override
    Optional<Product> findById(Long aLong);

    List<Product> findProductByCategory(String category);

    Product findProductById(Long id);

    List<Product> findAll();

}
