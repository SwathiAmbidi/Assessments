package lab5.tasks.com.cg.eis.exception;

import java.util.Scanner;

public class EmployeeSalaryMain {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Name");
		String Name = in.nextLine();
		System.out.println("Enter salary");
		Double salary = Double.parseDouble(in.nextLine());
		
		try {
			Employee obj = new Employee(salary);
			System.out.println("your salary is: "+salary);
			//System.out.println(obj.toString());
		}
		catch (EmployeeException e) {
			System.out.println(e);
			// TODO: handle exception
		}
		
		
	}

}
