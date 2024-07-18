package com.javamidterm.customerrestapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javamidterm.customerrestapi.model.Customer;

import java.util.List;
import java.util.Optional;

@Service
public class Customer implements ICustomer{
    final private Customer productRepository;

    @Autowired
    public Customer(Customer productRepository) {
        this.productRepository = productRepository;
    }

    public List<Customer> getAllProducts(){
        return productRepository.findAll();
    }

    @Override
    public Customer getProductById(long id) {
        Optional<Customer> exist = productRepository.findById(id);

        if (exist.isEmpty()) {
            return null;
        }
        return exist.get();
    }

    @Override
    public List<Customer> postProducts(Customer product) {
        productRepository.save(product);
        return productRepository.findAll();
    }

    @Override
    public List<Customer> updateProductById(long id, Customer product) {
        Optional<Customer> exist = productRepository.findById(id);
        Customer newProduct = new Customer();

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
