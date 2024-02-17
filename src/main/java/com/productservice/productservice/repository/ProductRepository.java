package com.productservice.productservice.repository;

import com.productservice.productservice.models.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
    List<Product> findAllByTitle(String title);
    List<Product> findAllByTitleContaining(String title,Pageable pageable);
   // List<Product> findAllTitleContaining(String title);
    List<Product>findAll();

}
