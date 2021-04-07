package lab1;
import java.util.*;

public class CheckIfPowerOf2 {
	public boolean checkNumber(int num) {
		//boolean flag=false;
		
		//int n=0;
		while(num%2==0) {
			num /= 2;
		}
		if(num == 1) return true;
		if(num<0 || num!=1) return false;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckIfPowerOf2 obj = new CheckIfPowerOf2();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = in.nextInt();
		if(obj.checkNumber(number)) {
			System.out.println(number+" is a power of 2");
		}
		else
			System.out.println(number+" is not a power of 2");
	
	}

}
