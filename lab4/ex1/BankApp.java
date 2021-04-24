package lab4.ex1;

import java.util.concurrent.ThreadLocalRandom;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc = new Account();
		Person obj = new Person();
		obj.setName("smith");
		acc.setAccHolder(obj);
		acc.setBalance(2000);
		acc.setAccNum();
		
		acc.deposit(2000);
		
		Account acc2 = new Account();
		Person obj2 = new Person();
		obj2.setName("Kathy");
		acc2.setAccHolder(obj2);
		acc2.setBalance(3000);
		acc2.setAccNum();
		
		acc2.withdraw(2000);
		
		System.out.println("Updated balance of smith("+acc.getAccNum()+"): "+acc.getBalance());
		System.out.println("Updated balance of Kathy: "+acc2.getBalance());
		
		
		//savings and current usage
		Account ac = new SavingsAccount();
		Person sobj = new Person();
		sobj.setName("smith");
		ac.setAccHolder(sobj);
		ac.setBalance(200);
		ac.setAccNum();
		ac.withdraw(100);
		//acc.deposit(2000);
		
		System.out.println(ac.getBalance());
		
		CurrentAccount ac2 = new CurrentAccount();
		Person cobj = new Person();
		cobj.setName("smith");
		ac2.setOverdraftLimit(10000);
		ac2.setAccHolder(cobj);
		ac2.setBalance(200);
		ac2.setAccNum();
		
		ac2.withdraw(1000000);
		//acc.deposit(2000);
		
		System.out.println(ac2.getBalance());
		
	}

}
