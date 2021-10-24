package com.advesh.studio.repository;

import com.advesh.studio.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    
}
