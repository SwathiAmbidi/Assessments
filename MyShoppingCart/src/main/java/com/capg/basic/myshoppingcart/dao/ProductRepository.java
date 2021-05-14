package com.capg.basic.myshoppingcart.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.basic.myshoppingcart.bean.Product;



public interface ProductRepository extends JpaRepository<Product,Integer>,CustomProductRepository{
	
	//Product findByName(String name);
	
}