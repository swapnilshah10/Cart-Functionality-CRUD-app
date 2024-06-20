package com.example.demo.controllers;

import com.example.demo.models.Product;
import com.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public Product getProductByid(@PathVariable Long id){
        return productService.getproduct(id);
    }

    @GetMapping("/all")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @GetMapping("/name/{name}")
    public Product getProductByName(@PathVariable String name){
        return productService.getProductByName(name);
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody  Product product){
        return productService.addProduct(product);
    }

    @DeleteMapping("/delete")
    public String delProduct(Long id){
        return productService.delProduct(id);
    }

}
