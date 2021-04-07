package lab1;

import java.util.Scanner;

public class Primes {
	public boolean isPrime(int n) {
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n%i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Primes obj = new Primes();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = in.nextInt();
		System.out.println("Primes upto "+num+" are");
		for(int j=2; j<=num; j++) {
			if(obj.isPrime(j))
				System.out.print(j+" ");
		}
	}

}
