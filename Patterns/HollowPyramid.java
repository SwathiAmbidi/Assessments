package patterns;
import java.util.*;
public class HollowPyramid {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the user input: ");
		int user = in.nextInt();
		int i, space;
		for(i=1;i<=user;i++)
		{
		
			
		   for(space=1;space<=user-i;space++)
		   {
		     System.out.print(" ");
		   }
		   if(i==1 || i==user) {
			   for(int j=1; j<=2*i-1; j++)
			      System.out.print("*");
		   }
		   else {
			   for(int j=1; j<= 2*i-1; j++) {
				   if(j==1 || j==2*i-1)
					   System.out.print("*");
				   else
					   System.out.print(" ");
			   }
		   }
		   System.out.println();
		}
		
	}
}
