package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class RemovingDuplicates {
	
	public int[] modifyArray(int ar[]) {
		int k=0,len = ar.length,count=0;
        //Removing duplicates
		for(int ele=0; ele<len-1; ele++) {
			if(ar[ele] != ar[ele+1])
				ar[k++] = ar[ele];
			else count++;
		}
		ar[k++] = ar[len-1];
		while(k < len) {
			continue; 
		}
		//descending order sort
		for (int i = 0; i < len-1; i++) {
            for (int j = 0; j < len-i-1; j++)
            	
                if (ar[j] < ar[j+1])
                {
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            
    	}
		return ar;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemovingDuplicates obj = new RemovingDuplicates();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int number = in.nextInt();
		int ar[] = new int[number];
		//int index=0;
		System.out.println("Enter the array:");
		for(int i=0; i<number; i++)
			ar[i]=in.nextInt();
		Arrays.sort(ar);
		obj.modifyArray(ar);
		for(int i: ar)
			System.out.print(i+" ");
	}

}
