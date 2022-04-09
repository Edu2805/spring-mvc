package com.devinhouse.showproduct.service;

import com.devinhouse.showproduct.model.Product;
import com.devinhouse.showproduct.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductService {

    private ProductRepository productRepository;

    public List<Product> findAll(){

        return productRepository.findAll();
    }

    public Product insert(Product product){
        return productRepository.save(product);
    }
}
