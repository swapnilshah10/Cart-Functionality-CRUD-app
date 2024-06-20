//package com.example.demo.dataloader;
//
//import com.example.demo.models.Cart;
//import com.example.demo.models.Product;
//import com.example.demo.repository.CartRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class CartDataLoader implements CommandLineRunner{
//    @Autowired
//    private CartRepo cartRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        cartRepository.save(new Cart());
//        cartRepository.save(new Cart());
//        cartRepository.save(new Cart());
//    }
//}
