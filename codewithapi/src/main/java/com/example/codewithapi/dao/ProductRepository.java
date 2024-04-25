package com.example.codewithapi.dao;
//package com.example.codewithapi.product;

import com.example.codewithapi.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}


