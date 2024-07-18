package com.javamidterm.customerrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javamidterm.customerrestapi.model.Customer;

public interface Customer extends JpaRepository<Customer, Long> {
}
