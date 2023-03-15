package com.example.testshop.services;

import com.example.testshop.models.Product;
import com.example.testshop.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    public List<Product> listProducts(String title){
        log.info("!!!!!!!!!!!!!!!!!!!!!!!!", title);
        if (title != null)
            return productRepository.findByTitle(title);
        return productRepository.findAll();
    }

    public void saveProduct(Product product){
        log.info("***********************", product);
        // log.info("Saving new {}", product);
        productRepository.save(product);
    }

    public void deleteProduct(Long id){
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>", id);
        productRepository.deleteById(id);
    }

    public Product getProductById(Long id) {
        log.info("+++++++++++++++++++++++++", id);
        return productRepository.findById(id).orElse(null);
    }
}
