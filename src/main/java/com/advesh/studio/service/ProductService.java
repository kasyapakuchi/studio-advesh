package com.advesh.studio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.advesh.studio.model.*;
import com.advesh.studio.repository.ProductRepository;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

@Service
public class ProductService {


    @Autowired
    ProductRepository productRepository;

    public List<Product> getProducts(){
        List<Product> products = new ArrayList<Product>();
        productRepository.findAll().forEach(product->products.add(product));
        return products;
    }

    public ResponseEntity<String> addProduct(Product product) {
        productRepository.save(product);
        return null;
    }

    // public ResponseEntity<String> addProduct(Map<String, String> product) {
    //     Product product = new Product()
    //     return null;
    // }
    
}
