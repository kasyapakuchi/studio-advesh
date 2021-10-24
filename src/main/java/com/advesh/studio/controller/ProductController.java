package com.advesh.studio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController; 
import org.springframework.web.bind.annotation.ResponseBody; 

import com.advesh.studio.service.ProductService; 
import com.advesh.studio.model.*;
import java.util.List;
import java.util.Map;  

@RestController
public class ProductController {

    @Autowired
    ProductService productService;
    
    @GetMapping(value="/products",produces="application/json")
    private @ResponseBody List<Product> getProducts(){
        System.out.println(productService.getProducts());
        return productService.getProducts();
    }

    @PostMapping(value="/addproducts")
    private @ResponseBody ResponseEntity<String> addProduct(@RequestBody Product productMap){
        System.out.println(productService.addProduct(productMap));
        return productService.addProduct(productMap);
    }

    // @PostMapping(value="/addproducts")
    // private @ResponseBody ResponseEntity<String> addProduct(@RequestBody Map<String,String> productMap){
    //     System.out.println(productService.addProduct(productMap));
    //     return productService.addProduct(productMap);
    // }
}
