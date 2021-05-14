package com.capg.basic.myshoppingcart.service;

import java.util.List;

import com.capg.basic.myshoppingcart.bean.Product;

public interface ProductService {
	
	public List<Product> getAllProducts();
    Product findById(int id);
    Product saveProduct(Product prd);
    String deleteProduct(int id);
    public Product updateProduct(Product p);
    

    public List<Product> productsById();
    public List<Product> getAllProductsByCategory(String category);
	
	public List<Product> getAllProductsByCategoryAndPrice(String category,int range1,int range2);
	

}
