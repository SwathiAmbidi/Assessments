package lab4.ex1;

public class SavingsAccount extends Account {

	private final double minBal=500;

	@Override
	public void withdraw(double bal) {
		// TODO Auto-generated method stub
		if(super.balance >= minBal) {
			super.withdraw(bal);
		}
		else
			System.out.println("Dear "+super.getAccHolder().getName()+" your Account has No minimum balance");
		
	}
	
	
}