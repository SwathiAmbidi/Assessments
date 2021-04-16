package lab3.task;

import java.util.Scanner;

public class checkPositiveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		checkPositiveString obj = new checkPositiveString();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string");
		String s = in.nextLine();
		if(obj.isPositiveString(s)) {
			System.out.println(s+" has an increasing sequence");
		}
		else {
			System.out.println(s+" has no increasing sequence");
		}
		
	}
	
	public boolean isPositiveString(String s) {
		char ch[] = s.toCharArray();
		boolean isPositive=true;
		for(int i=0; i<ch.length-1; i++) {
			if(ch[i]>ch[i+1]) {
				isPositive = false;
				break;
			}
		}
		return isPositive;
	}

}
