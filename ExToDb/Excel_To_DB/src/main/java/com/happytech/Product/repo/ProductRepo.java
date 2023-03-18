package com.happytech.Product.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.happytech.Product.entity.Product;

public interface ProductRepo extends JpaRepository<Product,Integer>{

}
