package lab5.tasks;

import java.util.Scanner;

public class ValidateMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the age");
		int age = Integer.parseInt(in.nextLine());
		try {
			ValidateAge obj = new ValidateAge(age);
			//obj.validate(age);
		}
		catch(ValidateAgeException e) {
			System.out.println(e);
		}
		
		
				
	}

}
