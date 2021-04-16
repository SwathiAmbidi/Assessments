package lab5.tasks;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName = in.nextLine();
		
		System.out.println("Enter last name");
		String lastName = in.nextLine();
		
		try {
			EmployeeName obj = new EmployeeName(firstName,lastName);
			System.out.println("Username: "+firstName+lastName);
		}
		catch (EmployeeNameException e) {
			System.out.println(e);
			
		}
		
		
	}

}
