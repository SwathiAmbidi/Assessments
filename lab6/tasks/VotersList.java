package lab6.tasks;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class VotersList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<Integer,String> votingDetails = new HashMap<>();
		
		votingDetails.put(111, "1999-04-12");
		votingDetails.put(112, "1998-04-12");
		votingDetails.put(113, "1989-04-12");
		votingDetails.put(121, "1999-04-12");
		votingDetails.put(122, "2014-04-12");
		votingDetails.put(116, "1999-04-12");
		votingDetails.put(115, "2016-04-12");
		List<Integer> eligibleVoters = new VotersList().votersList(votingDetails);
		for(int i: eligibleVoters) {
			System.out.println(i);
		}
		
		
	}
	public List<Integer> votersList(Map<Integer,String> v){
		LocalDate now = LocalDate.now();
		//LocalDate l2 = LocalDate.parse(null)
		List<Integer> e = new ArrayList<Integer>();
		for(Map.Entry<Integer, String> i: v.entrySet()) {
			LocalDate l2 = LocalDate.parse(i.getValue());
			Period diff = Period.between(l2, now);
			if(diff.getYears() > 18) {
				e.add(i.getKey());
			}
		}
		return e;
		
		
	}

}
