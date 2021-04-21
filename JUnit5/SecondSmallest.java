package junit;

public class SecondSmallest {


	public int getSecondSmallest(int ar[]) {
		
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
}
