package lab4.ex1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import day4.task1.Car;

public class BankApplication {

	Account accounts[] = new Account[1000];
	int index=0;
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankApplication obj = new BankApplication();
		while(true) {
			
			System.out.println("1. Add account ");
			System.out.println("2. View account details.");
			System.out.println("3. Withdraw money");
			
			int choice = new Scanner(System.in).nextInt();
			switch(choice) {
			case 1:
				obj.insertAccount();
				break;
			
			
				
				
			}
		
		}
		
	}//main
		
	public void insertAccount() {
		
		Person obj = new Person();
		String name=in.nextLine();
		obj.setName(name);
		
		
	}

	public boolean addAccount(Account a) {
		boolean isInserted = true;
		accounts[index++] = a;// SQL insert qery
		return isInserted;
	}
}
