package com.javamidterm.customerrestapi.service;

import java.util.List;

import com.javamidterm.customerrestapi.model.Customer;

public interface ICustomer {
    public List<Customer> getAllProducts();
    public Customer getProductById(long id);
    public List<Customer> postProducts(Customer product);
    public List<Customer> updateProductById(long id, Customer product);
}
