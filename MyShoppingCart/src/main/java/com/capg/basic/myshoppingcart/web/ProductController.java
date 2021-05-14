package com.capg.basic.myshoppingcart.web;

import java.time.LocalDate;

import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.basic.myshoppingcart.bean.Product;
import com.capg.basic.myshoppingcart.exception.InvalidCategory;
import com.capg.basic.myshoppingcart.exception.InvalidCostRangeException;
import com.capg.basic.myshoppingcart.exception.MyGlobalExceptionHandler;
import com.capg.basic.myshoppingcart.service.ProductService;

@Validated
@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	
	public ProductController() {
		System.out.println("------------");
	}
	@GetMapping("/home")
	public String home() {
		return "Welcome "+LocalDateTime.now();
	}
	
	
	
	@GetMapping("/products")
    public List<Product> findAllProducts() {
        return service.getAllProducts();
    }
	
	@GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable int id) {
		if(service.findById(id) != null) {
			return service.findById(id);
		}
		else 
			throw new NoSuchElementException();
        
		//return service.findById(id);
    }
	
	@PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

	@GetMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }
	@GetMapping("/products/{category}")
	public List<Product> getAllProductsByCategory(@PathVariable String category)
	{
		return service.getAllProductsByCategory(category);
	}
	@PostMapping("/addProduct")
    public Product addProduct(@Valid @RequestBody Product product) throws InvalidCategory{
		if(product.getCategory().equals("Laptop") || product.getCategory().equals("Mobile") || product.getCategory().equals("Headset")) {
			return service.saveProduct(product);
			
		}
		else {
			throw new InvalidCategory(product.getCategory());
		}
    }
	
	@GetMapping("/products/{category}/{range1}/{range2}")
	public List<Product> getAllProductsByCategoryAndPrice(@PathVariable String category,
			@PathVariable int range1,@PathVariable int range2)throws InvalidCostRangeException
	{
		if(category.equals("Laptop")&&range1<10000)
		{
			throw new InvalidCostRangeException(range1,range2);
		}
		return service.getAllProductsByCategoryAndPrice(category, range1, range2);
	}
	
	@GetMapping("/productsById")
	public List<Product> getProductsById(){
		return service.productsById();
	}
}
