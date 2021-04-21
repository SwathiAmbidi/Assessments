package junit;

import java.util.Arrays;

public class ReverseAndSortArray {

	public int[] getSorted(int ar[]) {
		int[] newar = new int[ar.length];
		int k=0;
		for(int i=0; i<ar.length; i++) 
			newar[k++] = rev(ar[i]);
		for (int i = 0; i < newar.length; i++)   
		{  
		for (int j = i + 1; j < newar.length; j++)   
		{  
		int tmp = 0;  
		if (newar[i] > newar[j])   
		{  
		tmp = newar[i];  
		newar[i] = newar[j];  
		newar[j] = tmp;  
		}  
		}
		}
		
		//Arrays.sort(newar);
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
