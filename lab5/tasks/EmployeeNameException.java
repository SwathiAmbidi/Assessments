package lab5.tasks;

import java.util.Arrays;

public class EmployeeNameException extends Exception{
	
	String fName,lName;
	
	public EmployeeNameException(String fName,String lName){
		super();
		this.fName = fName;
		this.lName = lName;
	}
	
	
	@Override
	public String toString() {
		return "Name is not valid";
	}
	
	
	
	

}
