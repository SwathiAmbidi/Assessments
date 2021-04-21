package junit;

public class NumberModification {

	public int modifyNumber(int num) {
		String s = Integer.toString(num);
		StringBuffer st = new StringBuffer();
		for(int i=0; i<s.length()-1; i++) {
			int t = Math.abs((int)(s.charAt(i)) - (int)(s.charAt(i+1)));
			st.append(t);
		}
		int last = Math.abs((int)(s.charAt(0)) - (int)(s.charAt(s.length()-1)));
		st.append(last);
		String result = st.toString();
		return Integer.valueOf(result);
		
	}
}
