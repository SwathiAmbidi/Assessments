package lab1;
import java.util.*;
import java.math.*;

public class DifferenceEx6 {
	public int calculateDifference(int num) {
		int sumOfSquares=0, squareOfSum=0;
		for(int i=1; i<=num; i++) {
			sumOfSquares += Math.pow(i, 2);
		}
		for(int i=1; i<=num; i++) {
			squareOfSum += i;
		}
		return (int)(sumOfSquares -(Math.pow(squareOfSum, 2)));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DifferenceEx6 obj = new DifferenceEx6();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = in.nextInt();
		System.out.println("Difference is: "+obj.calculateDifference(number));
	}

}
