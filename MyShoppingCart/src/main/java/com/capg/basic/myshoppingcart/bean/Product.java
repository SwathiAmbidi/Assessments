package com.capg.basic.myshoppingcart.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.BatchSize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




@Entity
@ApiModel(value="Product Bean")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(name="Product ID", value="Holds the minimum 3 INT Value", required=true)
	private int productId;
	
	@ApiModelProperty(name="ProductName",value="hold min 3 char product",required = true)
	@NotEmpty(message = "Product name cannot be null")
	@Size(min=3,max=15,message="Invalid product name")
	private String productName;
	
	@ApiModelProperty(name="ProductCost",value="hold min 1000 cost",required = true)
	@Min(value=1000,message="cost cannot be less than 1000")
	private int productCost;
	
	@Max(value=5,message="Recommended star rating is 5 ")
	@ApiModelProperty(name="Product ID", value="Holds the star rating out of 5", required=true)
	private int startRating;
	
	@Pattern(regexp="^Laptop",message="Not Matching our Laptop Inventory!")
	@ApiModelProperty(name="Product ID", value="Holds the Laptop, Mobile Phones and Headset Categories", required=true)
	private String category;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductCost() {
		return productCost;
	}
	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}
	public int getStartRating() {
		return startRating;
	}
	public void setStartRating(int startRating) {
		this.startRating = startRating;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Product(int productId, String productName, int productCost, int startRating, String category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
		this.startRating = startRating;
		this.category = category;
	}
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + productCost;
		result = prime * result + productId;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + startRating;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (productCost != other.productCost)
			return false;
		if (productId != other.productId)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (startRating != other.startRating)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ ", startRating=" + startRating + ", category=" + category + "]";
	}
	

	
	
}
