package day1_task1;
import java.util.*;

public class StudentMarks {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter english marks: ");
		int englishMarks = in.nextInt();
		
		System.out.print("Enter java marks: ");
		int java=in.nextInt();	
		
		System.out.print("Enter db marks: ");
		int db = in.nextInt();
		
		System.out.print("Enter spring marks: ");
		int springTools = in.nextInt();	
		float totalMarks = englishMarks+java+db+springTools;
		float avgMarks = totalMarks/4;
		System.out.println("Total = "+totalMarks);
		System.out.print("Average = "+avgMarks);
		
	}

}
