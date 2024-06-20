package com.javamidterm.productrestapi.repository;

import com.javamidterm.productrestapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
