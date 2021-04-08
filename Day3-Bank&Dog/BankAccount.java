package day3_task1;

public class BankAccount {
	private String accountHolderName;
	private int balance;
	private boolean status; // true for active / false for inactive
	
	// -------- 
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	// business methods
	public int doWithdrawal(int amount)
	{
		
			balance -= amount;
		return balance; // new balance
	}

	public int doDeposit(int amount)
	{
		
			balance += amount;
		
		
		return balance;
	}

	

	
}
