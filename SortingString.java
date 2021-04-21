package junit;

import java.util.Arrays;

public class SortingString {


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
		Arrays.sort(arr);
		return arr;
	}
}
