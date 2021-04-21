package lab6.tasks;

import java.util.HashMap;
import java.util.Map;

public class Squares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = {2,4,3,1,6,8,7};
		Map<Integer, Integer> squares = new Squares().getSquares(num);
		//Iterator itr = squares.getKeys.iterator();
		for(Map.Entry<Integer, Integer> p: squares.entrySet()) {
			System.out.println(p.getKey()+"-"+p.getValue());
		}
		
	}

	public  Map<Integer,Integer> getSquares(int[] ch){
		
		 Map<Integer,Integer> temp = new HashMap<>();
		 for(int i: ch) {
			 temp.put(i, i*i);
		 }
		 return temp;
	}
}
