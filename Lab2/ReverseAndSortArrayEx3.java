package lab2;
import java.util.*;
public class ReverseAndSortArrayEx3 {
	public int[] getSorted(int ar[]) {
		int[] newar = new int[ar.length];
		int k=0;
		for(int i=0; i<ar.length; i++) 
			newar[k++] = rev(ar[i]);	
		Arrays.sort(newar);
		return newar;
	}
	public int rev(int n) {
		int revnum=0;
		while(n>0) {
			int rem = n%10;
			revnum = revnum*10+rem;
			n /= 10;
		}
		return revnum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseAndSortArrayEx3 obj = new ReverseAndSortArrayEx3();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int number = in.nextInt();
		int ar[] = new int[number];
		//int index=0;
		System.out.println("Enter the array:");
		for(int i=0; i<number; i++)
			ar[i]=in.nextInt();
		System.out.println("Print the sorted array:");
		int t[] = obj.getSorted(ar);
		for(int i: t)
			System.out.print(i+" ");
		
	}

}
