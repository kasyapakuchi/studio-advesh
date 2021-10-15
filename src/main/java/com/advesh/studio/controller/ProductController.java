package com.advesh.studio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController; 
import org.springframework.web.bind.annotation.ResponseBody; 

import com.advesh.studio.service.ProductService; 
import com.advesh.studio.model.*;
import java.util.List;  

@RestController
public class ProductController {

    @Autowired
    ProductService productService;
    
    @GetMapping(value="/products",produces="application/json")
    private @ResponseBody List<Product> getProducts(){
        System.out.println(productService.getProducts());
        return productService.getProducts();
    }
}
