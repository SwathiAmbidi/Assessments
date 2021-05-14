package com.capg.basic.myshoppingcart.exception;

public class InvalidCategory extends Exception {

	String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public InvalidCategory(String category) {
		super();
		this.category = category;
	}

	public InvalidCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvalidCategory(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public InvalidCategory(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidCategory(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
