package com.capg.basic.myshoppingcart.dao;

import java.util.List;

import com.capg.basic.myshoppingcart.bean.*;
public interface CustomProductRepository {

	public List<Product> getProductByCategory(String proudctCategory);
	public List<Product> getProductByCategoryAndPrice(String proudctCategory,int range1,int range2);
	public List<Product> productsById();
	
}