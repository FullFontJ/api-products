package com.example.apiproduct.Service;

import com.example.apiproduct.Model.Products;
import com.example.apiproduct.Repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
    @Autowired
    private ProductsRepository productsRepository;

    public List<Products> getAllProduct() {
        return productsRepository.findAll();
    }

    public Products createProduct(Products product) {
        return productsRepository.save(product);
    }

    public void deleteProduct(Long id){
        productsRepository.deleteById(id);
    }

    public Products getProduct(Long id){
        return productsRepository.getReferenceById(id);
    }

}
