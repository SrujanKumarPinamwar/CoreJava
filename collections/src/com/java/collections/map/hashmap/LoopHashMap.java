package com.java.collections.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class LoopHashMap {

	public static void main(String[] args) {
		//Declaring HashMap
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		
		//Adding elements to HashMap
		hmap.put(1, "Adilabad");
		hmap.put(2, "Hyderabad");
		hmap.put(13, "Phoenix");
		hmap.put(15, "Columbus");
		hmap.put(9, "Houston");
		hmap.put(3, "USA");
		hmap.put(4, "Vijayawada");

		//For Loop
		System.out.println("For Loop: ");
		for(Map.Entry me: hmap.entrySet()){
			System.out.println("Key: "+me.getKey()+" & Value: "+me.getValue());
		}
		
		//Iterator
		System.out.println("Iterator: ");
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext()){
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.println("Key: "+mentry.getKey()+" & Value: "+mentry.getValue());
		}
		
		System.out.println("Map is empty or not: "+hmap.isEmpty());
		
		//Size of HashMap
		System.out.println("Size of HashMap: "+hmap.size());
		
		//Sorting HashMap
		Map<Integer, String> map = new TreeMap<Integer,String>(hmap);
		
		System.out.println("After Sorting"+hmap);
		
		//Removing all elements
		hmap.clear();
		System.out.println("After Clear: "+hmap);
	
		System.out.println("Map is empty or not: "+hmap.isEmpty());
		
	}

}
