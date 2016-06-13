package com.java.collections.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		//Declaring HashMap
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		//Adding elements (key,value) pairs to hash map
		hmap.put(1, "Thushara");
		hmap.put(2, "Rashmi");
		hmap.put(3, "Divya");
		hmap.put(4, "Shayestha");
		hmap.put(5, "Sushma");
		//hmap.put(5, "Ssushma");

		//Displaying elements in HashMap
		System.out.println("Elements in hashmap: "+hmap);
		
		//Display content using Iterator
		Set set = hmap.entrySet();
		
		//Set set = hmap.keySet();
		
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext()){
			
			// Map.Entry mentry = (Map.Entry) iterator.next();
			
			System.out.println("Iterator: "+iterator.next());
			// System.out.println("Key is: "+mentry.getKey()+" & value is: "+mentry.getValue());
		}
		
		//Get values based on keys
		System.out.println("Value with key 5 is: "+hmap.get(5));
		
		//Remove values based on keys		
		hmap.remove(2);
		
		System.out.println("Elements after removal of 2nd key: "+hmap);
		
		Iterator iterator2 = set.iterator();
		
		//Remove key value pairs from HashMap
		//hmap.clear();
		
		//Clone the HashMap
		//Object hmap2 = hmap.clone();
		//System.out.println("Hmap2: "+hmap2);
		
		System.out.println("Keyset"+hmap.keySet());
		
		while(iterator2.hasNext()){
			Map.Entry mentry2 =(Map.Entry) iterator2.next();
			System.out.println("Key is: "+mentry2.getKey()+" & value is: "+mentry2.getValue());			
		}
	}

}
