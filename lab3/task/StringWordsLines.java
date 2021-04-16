package lab3.task;

import java.util.Scanner;

public class StringWordsLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Sentence ");
		String s = sc.nextLine();	
		char ch[] = s.toCharArray();
		System.out.println("Characters: "+ch.length);	
		String words[] = s.split(" ");
		System.out.println("Words: "+words.length);        
		String lines[] = s.split("\r\n|\r|\n");
        System.out.println("Lines: "+lines.length);
        sc.close();
	}

}
