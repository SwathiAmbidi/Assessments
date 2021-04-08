package patterns;
import java.util.*;
public class RightTriangle {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the user input:");
		int user_input = in.nextInt();
		// star pattern
		for(int r=1; r<=user_input; r++) { //r - row
			for(int c=1; c<=r; c++) {    // c - column
				System.out.print(" * ");
			}
			System.out.println();
		}
		//numbers pattern
		int count=1;
		for(int r=1; r<=user_input; r++) {
			for(int c=1; c<=r; c++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}
}
