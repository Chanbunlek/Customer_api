package com.javamidterm.productrestapi.service;

import com.javamidterm.productrestapi.model.Product;

import java.util.List;

public interface IProduct {
    public List<Product> getAllProducts();
    public Product getProductById(long id);
    public List<Product> postProducts(Product product);
    public List<Product> updateProductById(long id, Product product);
}
