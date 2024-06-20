package com.javamidterm.productrestapi.controller;

import com.javamidterm.productrestapi.model.Product;
import com.javamidterm.productrestapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    final private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping()
    private List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("")
    private List<Product> createNewProducts(@RequestBody Product Body) {
        return productService.postProducts(Body);
    }

    @GetMapping("{id}")
    private Product getProductById(@PathVariable long id){
        return productService.getProductById(id);
    }

    @PutMapping("{id}")
    private List<Product> updateProduct(@PathVariable long id, @RequestBody Product Body) {
        return productService.updateProductById(id, Body);
    }
}
