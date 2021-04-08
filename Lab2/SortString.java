package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {

	public String[] sortStrings(String arr[]) {
		
		String s1, s2;
		int mid;
		for(int i = 0; i < arr.length; i++) {
			mid = (int) (arr[i].length()/2);
			if(arr[i].length() %2 == 0) {
				s1 = (arr[i].substring(0,mid)).toUpperCase();
				s2 = (arr[i].substring(mid,arr[i].length())).toLowerCase();
				arr[i] = s1 + s2;
			}
			else 
			{
				s1 = (arr[i].substring(0,mid+1)).toUpperCase();
				s2 = (arr[i].substring(mid+1,arr[i].length())).toLowerCase();
				arr[i] = s1 + s2;
			}
			
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i;
		SortString obj = new SortString();
		
		System.out.println("Size of the array:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter the elements (Strings):");
		String[] stringArray = new String[n];
		for(i = 0; i < n; i++) {
			stringArray[i] = sc.next();
		}
		Arrays.sort(stringArray);
		obj.sortStrings(stringArray);
		for(i = 0; i < n; i++) {
			System.out.print(stringArray[i] + " ");
	}

}

		
		
		
	}
