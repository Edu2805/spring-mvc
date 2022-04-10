package com.devinhouse.showproduct.service;

import com.devinhouse.showproduct.model.Product;
import com.devinhouse.showproduct.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@Service
public class ProductService {

    private ProductRepository productRepository;

    public List<Product> findAll(){

        return productRepository.findAll();

    }

    public Optional<Product> findById(UUID id){
        return productRepository.findById(id);
    }

    public Product insert(Product product){
        return productRepository.save(product);
    }

    public Product update(Product product){

        return productRepository.save(product);
    }

    public void delete(Product product){

        productRepository.delete(product);
    }
}
