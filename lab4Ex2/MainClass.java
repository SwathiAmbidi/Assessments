package lab4Ex2.com.cg.eis.pl;

import lab4Ex2.com.cg.eis.service.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Services obj = new Services();
		obj.getUserInput();
		obj.displayDetails();
		obj.findInsuranceScheme(obj.getSalary(), obj.getDesignation());
		
	}

}
