package lab6.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestElement {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		int arr[] = {12,56,43,67,8,9,90};
		System.out.println(new SmallestElement().getSecondSmallest(arr));
		
	}

	public int getSecondSmallest(int a[]) {
		List<Integer> arr = new ArrayList<Integer>();
		for(int i=0; i<a.length; i++)
		
			arr.add(a[i]);
		Collections.sort(arr);
		
		//Integer o[] = arr.toArray();
		return arr.get(1);
	}
}
