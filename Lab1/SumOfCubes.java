package lab1;
import java.util.*;
import java.math.*;
public class SumOfCubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfCubes obj = new SumOfCubes();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number to find Sum of the cubes of its digits");
		int num = in.nextInt();
		System.out.println("Sum of cubes is: "+obj.sumOfCubes(num));
	}
	public int sumOfCubes(int number) {
		int countOfDigits=0;
		int temp = number;
		while(temp>0) {
			temp /= 10;
			countOfDigits++;
		}
		int sum=0;
		for(int i=1; i<=countOfDigits; i++) {
			int rem = number%10; 
			sum += Math.pow(rem,3);
			number /= 10;
		}
		return sum;
	}
}
