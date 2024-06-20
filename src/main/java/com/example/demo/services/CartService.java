package com.example.demo.services;


import com.example.demo.models.Cart;
import com.example.demo.models.CartItem;
import com.example.demo.models.Product;
import com.example.demo.repository.CartItermRepo;
import com.example.demo.repository.CartRepo;
import com.example.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartService {

    @Autowired
    private CartRepo cartRepository;

    @Autowired
    private ProductRepo productRepository;

    @Autowired
    private CartItermRepo cartItemRepository;

    public Cart getCart(Long id) {
        return cartRepository.findById(id).orElse(new Cart());
    }

    public Cart addProductToCart(Long cartId, Long productId, int quantity) {
        Cart cart = cartRepository.findById(cartId).orElse(new Cart());
        Optional<Product> productOpt = productRepository.findById(productId);

        if (productOpt.isPresent()) {
            Product product = productOpt.get();
            boolean productExistsInCart = false;

            for (CartItem item : cart.getItems()) {
                if (item.getProduct().getId().equals(productId)) {
                    // Update the quantity of the existing product
                    item.setQuantity(item.getQuantity() + quantity);
                    productExistsInCart = true;
                    break;
                }
            }
            if (!productExistsInCart) {
                CartItem newItem = new CartItem();
                newItem.setProduct(product);
                newItem.setQuantity(quantity);
                newItem.setCart(cart);
                cart.getItems().add(newItem);
            }
            cart = cartRepository.save(cart);
        }

        return cart;
    }

    public void deleteCartItem(Long cartItemId) {
        cartItemRepository.deleteById(cartItemId);
    }
}
