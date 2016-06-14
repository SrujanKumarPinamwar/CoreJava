package com.java.collections.map.hashmap;

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

public class HashMapSorting {

	public static void main(String[] args) {
		
		//Declaring HashMap
		HashMap<Integer, String> hmap =  new HashMap<Integer, String>();
		
		//Adding key value pairs to HashMap     
		hmap.put(1, "A" );  
		hmap.put(2, "E" );
		hmap.put(3, "I");
		hmap.put(4, "O");
		hmap.put(5, "U" );
		
		System.out.println("Elements in HashMap: "+hmap);
		System.out.println("Before Sorting");
		
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.println("Key is: "+mentry.getKey()+" & value is: "+mentry.getValue());
		}
	
		 Map<Integer, String> map = sortByValues(hmap); 
	      System.out.println("After Sorting:");
	      Set set2 = map.entrySet();
	      Iterator iterator2 = set2.iterator();
	      while(iterator2.hasNext()) {
	           Map.Entry me2 = (Map.Entry)iterator2.next();
	           System.out.print(me2.getKey() + ": ");
	           System.out.println(me2.getValue());
	      }
	
	}
	
//		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>(hmap);
//		
//		System.out.println("After Sorting: ");
//		Set set2 = tmap.entrySet();
//		Iterator iterator2 = set.iterator();
//		while(iterator2.hasNext()){
//			Map.Entry mentry2 = (Map.Entry)iterator2.next();
//			System.out.println("Key is: "+mentry2.getKey()+" & value is: "+mentry2.getValue());
//		}
		
		
		
		private static HashMap sortByValues(HashMap map) { 
		       List list = new LinkedList(map.entrySet());
		       //Defined Custom Comparator here
		       
		       Collections.sort(list, new Comparator() {
		           
		    	   public int compare(Object o1, Object o2) {
		               return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
		            }
		       });

		       // Here I am copying the sorted list in HashMap
		       // using LinkedHashMap to preserve the insertion order
		       HashMap sortedHashMap = new LinkedHashMap();
		       for (Iterator it = list.iterator(); it.hasNext();) {
		              Map.Entry entry = (Map.Entry) it.next();
		              sortedHashMap.put(entry.getKey(), entry.getValue());
		       } 
		       return sortedHashMap;
		  }
		
		
		
	

}
