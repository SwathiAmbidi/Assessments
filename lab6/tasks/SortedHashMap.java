package lab6.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.lang.Comparable;

public class SortedHashMap {

	HashMap<String, Integer> map;
	  LinkedHashMap<String, Integer> linkedMap;
	  ArrayList<Map.Entry<String, Integer>> arr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortedHashMap obj = new SortedHashMap();
		HashMap<String,Integer> map = new HashMap<>();
		map.put("Swathi", 97);
		map.put("Swetha", 79);
		map.put("Saansa", 87);
		map.put("Sri", 67);
		
		LinkedHashMap<String,Integer> map2 = new SortedHashMap().sortedMap(map);
		
		
		
		for(Map.Entry<String, Integer> a:map2.entrySet()) {
			System.out.println(a.getKey()+"->"+a.getValue());
		}
		//LinkedHashMap<String,Integer> map2 = new SortedHashMap().sortedMap(map); 
		
	}
	
	public LinkedHashMap<String,Integer> sortedMap(HashMap<String,Integer> map) {
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer> >(map.entrySet());
		
		
		Comparator<Map.Entry<String, Integer>>  myComparator =new Comparator<Map.Entry<String, Integer> >(){
			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		};
		Collections.sort(list,myComparator);
		
		LinkedHashMap<String, Integer> t = new LinkedHashMap<String, Integer>();
		for(Map.Entry<String, Integer> a:list) {
			t.put(a.getKey(), a.getValue());
		}
		return t;
		
	}
	
	

}
