package com.example.demo.repository;

import com.example.demo.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepo extends  JpaRepository<Product, Long>{
    Optional<Product> findByNameIgnoreCase(String name);
}
