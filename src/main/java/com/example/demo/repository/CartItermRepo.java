package com.example.demo.repository;

import com.example.demo.models.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CartItermRepo  extends  JpaRepository<CartItem, Long>{
    void deleteById(Long id);
}
