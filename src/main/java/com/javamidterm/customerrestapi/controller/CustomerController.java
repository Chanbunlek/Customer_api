package com.javamidterm.customerrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.javamidterm.customerrestapi.model.Customer;

import java.util.List;

@RestController
@RequestMapping("/products")
public class CustomerController {
    final private Customer productService;

    @Autowired
    public CustomerController(Customer productService) {
        this.productService = productService;
    }
    @GetMapping()
    private List<Customer> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("")
    private List<Customer> createNewProducts(@RequestBody Customer Body) {
        return productService.postProducts(Body);
    }

    @GetMapping("{id}")
    private Customer getProductById(@PathVariable long id){
        return productService.getProductById(id);
    }

    @PutMapping("{id}")
    private List<Customer> updateProduct(@PathVariable long id, @RequestBody Customer Body) {
        return productService.updateProductById(id, Body);
    }
}
