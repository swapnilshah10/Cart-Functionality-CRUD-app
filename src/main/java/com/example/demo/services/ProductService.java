package com.example.demo.services;

import com.example.demo.models.Product;
import com.example.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getProducts(){
        return productRepo.findAll();
    }

    public Product getproduct(Long id){
        return productRepo.findById(id).orElse(null);
    }

    public Product getProductByName(String name){
        return productRepo.findByNameIgnoreCase(name).orElse(null);
    }

    public Product addProduct(Product product){
        if(product.getName() != null && !product.getName().isEmpty()
                && product.getPrice() > 0){
            productRepo.save(product);
            return product;
        }
        else{
            return null;
        }
    }

    public String delProduct(Long id){
        Optional<Product> p = productRepo.findById(id);
        if(p.isPresent()) {productRepo.deleteById(id);
        return "DELETED";}
        return "NOT FOUND";
    }

}
