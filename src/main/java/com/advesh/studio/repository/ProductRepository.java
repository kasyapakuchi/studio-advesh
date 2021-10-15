package com.advesh.studio.repository;

import com.advesh.studio.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;  

public interface ProductRepository extends CrudRepository<Product,Integer> {
    
}
