package day1_task1;
import java.util.*;
public class EmployeeSalary {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the salary of employee");
		int basicSalary = in.nextInt();
		float HRA,DA,Tax;
		HRA = (float)(40*basicSalary)/100;
		DA = (float)60*(basicSalary+HRA)/100; 
		float net = (((float)basicSalary)+HRA+DA)*12;
		if(net <200000) 
			Tax = net;
		else if(net >=200000 && net<=600000) 
			Tax=(10*net)/100;
		else 
			Tax = (20*net)/100;
		System.out.println("Annual take home salary: "+(net - Tax));
	}
}
