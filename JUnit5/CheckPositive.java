package junit;

public class CheckPositive {

	public boolean isPositiveString(String s) {
		char ch[] = s.toCharArray();
		boolean isPositive=true;
		for(int i=0; i<ch.length-1; i++) {
			if(ch[i]>ch[i+1]) {
				isPositive = false;
				break;
			}
		}
		return isPositive;
	}
}
