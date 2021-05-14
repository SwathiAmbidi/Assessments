package com.capg.basic.myshoppingcart.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.basic.myshoppingcart.bean.Product;
import com.capg.basic.myshoppingcart.dao.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	
	@Autowired
    private ProductRepository dao;

   
	@Override
	public List<Product> getAllProducts() {
	
		return dao.findAll();
	}

	@Override
	public Product findById(int id) {
		return dao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Product saveProduct(Product prd) {

		dao.save(prd);
		return prd;
	}
	@Override
	public Product updateProduct(Product p) {
        Product existingProduct = dao.findById(p.getProductId()).orElse(null);
        existingProduct.setProductId(p.getProductId());
        existingProduct.setProductCost(p.getProductCost());
        existingProduct.setCategory(p.getCategory());
        existingProduct.setProductName(p.getProductName());
        existingProduct.setStartRating(p.getStartRating());
        return dao.save(existingProduct);
    }

	@Override
	public String deleteProduct(int id) {
		
		dao.deleteById(id);
        return "product removed successfully " + id;
	}

	@Override
	public List<Product> getAllProductsByCategory(String category) {
		
		return dao.getProductByCategory(category);
	}

	@Override
	public List<Product> getAllProductsByCategoryAndPrice(String category, int range1, int range2) {
		
		return dao.getProductByCategoryAndPrice(category, range1, range2);
	}

	@Override
	public List<Product> productsById() {
		
		return dao.productsById();
	}

	
}
