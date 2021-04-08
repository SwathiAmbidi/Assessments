package day3_task1;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {	  
		/* business use case
		 * -------------------
		 * if balance is less than 10,000 :- account holder cannot withdrawal 
		 * in such case account status should be inactive.
		 *  
		 * */

          Scanner in = new Scanner(System.in);
          BankAccount account1 = new BankAccount(); 
          while(true) {
        	  System.out.println("Please enter your name");
        	  String name = in.next();
        	  account1.setAccountHolderName(name);
        	  System.out.println("Please enter your Current Balance");
        	  int balance = in.nextInt();
        	  account1.setBalance(balance);
        	  while(true) {
        	  System.out.println("Press 1 to Withdraw money\nPress 2 to Deposit money\nPress 3 to exit");
        	  int choice=in.nextInt();
        	  switch(choice) {
        	  case 1:
        		  System.out.println("Enter Amount to withdraw");
        		  int m = in.nextInt();
        		  System.out.println("Dear "+account1.getAccountHolderName());
        		  if(account1.getBalance()<10000) {
        			  account1.setStatus(false);
        			  System.out.println("You cannot withdraw the amount\nYour current balance is "+account1.getBalance());
        		  }
            		  
            	  else
            		  System.out.println("Your withdraw successfull\nBalance after withdrawal:- "+ account1.doWithdrawal(m));
            		 
        		  break;
        	  case 2:
        		  System.out.println("Dear "+account1.getAccountHolderName());
        		  System.out.println("Enter Amount to deposit");
        		  int n = in.nextInt();
        		  System.out.println("Balance after deposit:- "+ account1.doDeposit(n)); 
        		  break;
        	  case 3:
        		  System.out.println("Thanks for using");
        		  System.exit(0);
        	  }
        	  }
          }
	}
}
