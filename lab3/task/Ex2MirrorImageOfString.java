package lab3.task;

import java.util.Scanner;

public class Ex2MirrorImageOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner in = new Scanner(System.in);
		Ex2MirrorImageOfString obj = new Ex2MirrorImageOfString();
		System.out.println("Enter string to get mirror image");
		String s = in.nextLine();
		String res = obj.getImage(s);
		System.out.println("Image is: "+s+"|"+res);
		
	}

	public String getImage(String str) {
		StringBuffer s = new StringBuffer(str);
		//String t[] = str.split(" ");
		//s.append(str);
		s.reverse();
		return s.toString();
	}
}
