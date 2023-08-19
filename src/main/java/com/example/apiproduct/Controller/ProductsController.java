package com.example.apiproduct.Controller;

import com.example.apiproduct.Model.Products;
import com.example.apiproduct.Service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
    @Autowired
    private ProductsService productsService;

    @GetMapping(value = "/all")
    public List<Products> getAllProducts() {
        return productsService.getAllProduct();
    }

    @PostMapping(value = "/save")
    public Products createProduct(@RequestBody Products product) {
        return productsService.createProduct(product);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteProduct(@PathVariable Long id){
        Products product = productsService.getProduct(id);
        if(product != null){
            productsService.deleteProduct(id);
        }
    }
}
