package com.example.springbootmysql.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.springbootmysql.model.Product;

public interface ProductRepo extends CrudRepository<Product,Integer>{

}
