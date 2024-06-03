package com.project.dem.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.project.dem.entity.Product;
import com.project.dem.repository.Productrepo;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private Productrepo productRepository;

    public Page<Product> getAllProducts(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Optional<Product> updateProduct(Long id, Product product) {
        return productRepository.findById(id)
                .map(existingProduct -> {
                    existingProduct.setName(product.getName());
                    existingProduct.setCategory(product.getCategory());
                    return productRepository.save(existingProduct);
                });
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
