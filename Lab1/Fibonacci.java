package lab1;

import java.util.Scanner;

public class Fibonacci {
	public int non_recApproach(int n) {
		if(n==1 || n==2)
			return 1;
		int first=1,second = 1;
		int third=0;
		for(int i=2; i<n; i++) {
			third = first+second;
			first = second;
			second = third;
		}
		return third;
	}
	public int recApproach(int n) {
		if(n==1 || n==2)
			return 1;
		
		return recApproach(n-1)+recApproach(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci obj = new Fibonacci();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = in.nextInt();
		System.out.println("Result using non-recursive method is: "+obj.non_recApproach(num));

		System.out.println("Result using recursive method is: "+obj.recApproach(num));
	}

}
