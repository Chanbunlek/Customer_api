package com.javamidterm.productrestapi.service;

import com.javamidterm.productrestapi.model.Product;
import com.javamidterm.productrestapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProduct{
    final private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(long id) {
        Optional<Product> exist = productRepository.findById(id);

        if (exist.isEmpty()) {
            return null;
        }
        return exist.get();
    }

    @Override
    public List<Product> postProducts(Product product) {
        productRepository.save(product);
        return productRepository.findAll();
    }

    @Override
    public List<Product> updateProductById(long id, Product product) {
        Optional<Product> exist = productRepository.findById(id);
        Product newProduct = new Product();

        if (exist.isEmpty()) {
            return null;
        }
        newProduct = exist.get();
        newProduct.setName(product.getName());
        newProduct.setPrice(product.getPrice());
        newProduct.setQuantity(product.getQuantity());

        return productRepository.findAll();
    }

}
