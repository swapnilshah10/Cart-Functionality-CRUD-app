//package com.example.demo.dataloader;
//
//import com.example.demo.models.Product;
//import com.example.demo.repository.ProductRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class ProductDataLoader implements CommandLineRunner {
//
//    @Autowired
//    private ProductRepo productRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        productRepository.save(new Product(null, "Product 1", 10.0));
//        productRepository.save(new Product(null, "Product 2", 20.0));
//        productRepository.save(new Product(null, "Product 3", 30.0));
//    }
//}
