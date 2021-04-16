package lab3.task;

import java.util.Scanner;

public class Ex3ConsonantsChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex3ConsonantsChange obj = new Ex3ConsonantsChange();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string");
		String s = in.nextLine();
		char ch[] = s.toCharArray();
		System.out.println(obj.alterString(ch));
	}

	public boolean isVowel(char c) {
		if(c!='a'&&c!='A'&&c!='e'&&c!='E'&&c!='i'&&c!='I'&&c!='o'&&c!='O'&&c!='u'&&c!='U')
			return false;
		return true;
	}
	public String alterString(char str[]) {
		
		StringBuffer st = new StringBuffer();
		
		for(int i=0;i<str.length; i++) {
			if(isVowel(str[i])) {
				st.append(str[i]);
			}
			else {
				str[i] = (char)(str[i]+1);
				st.append(str[i]);
			}
				
					
			
		}
		return st.toString();
	}
}
