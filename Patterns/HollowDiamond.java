package patterns;

import java.util.*;

public class HollowDiamond {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the user input: ");
		int user = in.nextInt();
		int i, space, stars=0;
		for(i=1;i<=user;i++,stars=0)
		{
		   for(space=1;space<=user-i;space++)
		   {
		     System.out.print(" ");
		   }
		   while(stars != 2*i-1) {
			   if(stars==0 || stars == 2*i-2)
			       System.out.print("*");
			   else
				   System.out.print(" ");
			   stars++;
		   }
		   System.out.println();
		}
		for(i=user-1;i>=1;i--,stars=0)
		{
		   for(space=user;space>i;space--)
		   {
		     System.out.print(" ");
		   }
		   while(stars != 2*i-1) {
			   if(stars==0 || stars == 2*i-2)
			       System.out.print("*");
			   else
				   System.out.print(" ");
			   stars++;
		   }
		   System.out.println();
		}
	}
}
