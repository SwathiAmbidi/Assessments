package lab2;
import java.util.*;
public class SecondSmallest {
	public int getSecondSmallest(int ar[]) {
		//int min = ar[0];
		//Arrays.sort(ar);
		for(int i=1; i<ar.length; i++) {
			for(int j=i; j>0; j--) {
				if(ar[j]<ar[j-1]) {
					int t = ar[j];
					ar[j] = ar[j-1];
					ar[j-1] = t;
				}
			}
		}
		return ar[1];
	}
	public static void main(String args[]) {
		SecondSmallest obj = new SecondSmallest();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int number = in.nextInt();
		int ar[] = new int[number];
		//int index=0;
		System.out.println("Enter the array:");
		for(int i=0; i<number; i++) {
			ar[i]=in.nextInt();
		}
		System.out.println("Second smallest element is: "+obj.getSecondSmallest(ar));
		
	}
}
