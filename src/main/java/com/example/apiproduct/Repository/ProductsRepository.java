package com.example.apiproduct.Repository;

import com.example.apiproduct.Model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Long> {


}