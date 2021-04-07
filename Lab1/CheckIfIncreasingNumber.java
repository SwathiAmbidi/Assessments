package lab1;
import java.util.*;
public class CheckIfIncreasingNumber {
	public boolean checkNumber(int num) {
		boolean flag=true;
		int curDigit = num%10;
		num /= 10;
		while(num>0) {
			if(curDigit <= num%10)
				flag = false;
			curDigit = num%10;
			num /= 10;
		}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckIfIncreasingNumber obj = new CheckIfIncreasingNumber();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = in.nextInt();
		if(obj.checkNumber(number)) {
			System.out.println(number+" is an increasing number");
		}
		else
			System.out.println(number+" is not an increasing number");
	}

}
