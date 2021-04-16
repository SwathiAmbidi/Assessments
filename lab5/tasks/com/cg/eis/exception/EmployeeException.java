package lab5.tasks.com.cg.eis.exception;

import java.util.Arrays;



public class EmployeeException extends Exception{
	
	private double salary;
	EmployeeException(String s){
		super(s);
	}
	
	EmployeeException(double salary){
		super();
		this.salary = salary;
		
	}

	@Override
	public String toString() {
		
		return "Not valid for Scheme";
	}
	
	
	
	

}
