package lab3.task;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex1UsingStringTokenizer {
	public static void main(String[] args) {
		int sum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter line of integers");
		String str = in.nextLine();
		StringTokenizer st = new StringTokenizer(str," ");
		while(st.hasMoreTokens()) {
			String t = st.nextToken();
			System.out.println(t);
			sum += Integer.parseInt(t);
		}
		System.out.println("Sum: "+sum);
		
	}

}
