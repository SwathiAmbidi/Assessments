package lab3.task;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date obj = new Date();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Date in format yy-month-day");
		String s = in.nextLine();
		obj.dateCalculation(s);
	}
	
	public void dateCalculation(String s) {
		LocalDate date = LocalDate.parse(s);
		LocalDate now = LocalDate.now();
		Period p = Period.between(date, now);
		System.out.println("Days Difference: "+p.getDays());
		System.out.println("Months Difference: "+p.getMonths());
		
		System.out.println("Years Difference: "+p.getYears());
	}

}
