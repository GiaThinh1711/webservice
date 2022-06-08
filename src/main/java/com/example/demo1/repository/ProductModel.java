package com.example.demo1.repository;

import com.example.demo1.enity.Product;

import java.util.List;

public interface ProductModel {
    Product save(Product product);
    Product update(Product product,int id);
    boolean delete(int id);
    List<Product> findAll();
    Product findById(int id);
}
