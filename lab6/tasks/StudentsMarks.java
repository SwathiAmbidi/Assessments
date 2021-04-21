package lab6.tasks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentsMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> input = new HashMap<>();
		input.put(001, 65);
		input.put(002, 95);
		input.put(003, 85);
		input.put(004, 35);
		input.put(005, 99);
		input.put(006, 90);
		Map<Integer, String> output = new StudentsMarks().getStudents(input);
		for(Map.Entry<Integer, String> i: output.entrySet()) {
			System.out.println(i.getKey()+"->"+i.getValue());
		}
	}
	
	public Map<Integer, String> getStudents(Map<Integer, Integer> m){
		Map<Integer, String> t = new HashMap<>();
		
		for(Map.Entry<Integer, Integer> i: m.entrySet()) {
			if(i.getValue() >= 90) {
				t.put(i.getKey(), "Gold");
			}
			else if(i.getValue() >= 80 && i.getValue() < 90) {
				t.put(i.getKey(), "Silver");
			}
			else if(i.getValue() >= 70 && i.getValue() < 80) {
				t.put(i.getKey(), "Bronze");
			}
		}
		return t;
		
		
		
		
	}

}
