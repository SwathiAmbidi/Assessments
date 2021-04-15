package lab4Ex2.com.cg.eis.service;

import java.util.Scanner;

import lab4Ex2.com.cg.eis.bean.*;

public class Services extends Employee implements EmployeeService{

	@Override
	public void getUserInput() {
		System.out.println("Enter employee name");
		Scanner in = new Scanner(System.in);
		String name = in.next();
		super.name = name;
		System.out.println("Enter employee ID");
		String id = in.next();
		super.id = id;
		System.out.println("Enter employee salary");
		double salary = in.nextDouble();
	    super.salary = salary;
	    System.out.println("Enter employee designation");
	    String design = in.next();
	    super.designation = design;
	    
	    
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Employee name: "+super.getName());
		System.out.println("Employee Id: "+super.getId());
		System.out.println("Employee salary: "+super.getSalary());
		System.out.println("Employee designation: "+super.getDesignation());
		
		
	}
	
	
	public void findInsuranceScheme(double salary,String design) {
		
		if(salary > 100000 && (designation.equalsIgnoreCase("Manager")  || designation.equalsIgnoreCase("Developer"))) {
			setInsuranceScheme("Scheme type is: one time investment");
			System.out.println(getInsuranceScheme());
		}
		else if(salary < 100000 && (designation.equals("Developer") || designation.equalsIgnoreCase("Manager"))) {
			setInsuranceScheme("yearly");
			System.out.println(getInsuranceScheme());
		}
	}
	
}
	