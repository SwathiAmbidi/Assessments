package lab1;
import java.util.*;
public class DivisibleBy3Or5Ex5 {
	public int calculateSum(int num) {
		int sum=0;
		for(int i=1; i<=num; i++) {
			if(i%3==0 || i%5==0) {
				sum += i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivisibleBy3Or5Ex5 obj = new DivisibleBy3Or5Ex5();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = in.nextInt();
		System.out.println(obj.calculateSum(number));
		
	}

}
