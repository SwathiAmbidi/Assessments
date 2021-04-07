package day1_task1;
import java.util.*;
public class DateSuffix {
	   static String SuitableSuffix(int x) {
		if(x >= 11 && x<=13) return "th";
		else{
			switch(x % 10) {
			case 1: 
				return "st";
			case 2: 
				return "nd";
			case 3: 
				return "rd";
			default: 
				return "th";
			}
		}
	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter date: ");
		int date = in.nextInt();
		if(date<=1 || date>=31) System.out.print("Wrong Date");
		else {
			System.out.println(date+SuitableSuffix(date));
		}
	}
}
