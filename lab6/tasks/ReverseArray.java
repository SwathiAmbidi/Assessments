package lab6.tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		
		
		int arr[] = {10,20,13,12,598,033};
		int a[] = new ReverseArray().getSorted(arr);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
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

}
