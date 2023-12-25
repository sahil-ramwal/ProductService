package com.productservice.productservice.repository;

import com.productservice.productservice.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryInterface extends JpaRepository<Category, UUID> {
}
