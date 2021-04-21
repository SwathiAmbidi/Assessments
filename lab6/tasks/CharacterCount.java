package lab6.tasks;

import java.util.HashMap;
import java.util.*;

import java.io.*;
public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch[] = {'a','a','n','b','f','g','h','y','t','r','o'};
		
		Map<Character,Integer> m = new CharacterCount().countChars(ch);
		for(Map.Entry<Character, Integer> p: m.entrySet()) {
			System.out.println(p.getKey()+"-"+p.getValue());
		}
	}
	public  Map<Character,Integer> countChars(char[] ch){
		
		 Map<Character,Integer> temp = new HashMap<>();
		 for(char c:ch) {
			 if(temp.containsKey(c)) {
				 temp.put(c, temp.get(c) + 1);
			 }
			 else {
				 temp.put(c, 1);
			 }
		 }
		 return temp;
	}

}
