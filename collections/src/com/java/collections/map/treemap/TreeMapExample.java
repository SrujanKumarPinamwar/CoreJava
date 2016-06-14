package com.java.collections.map.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class TreeMapExample {

	public static void main(String[] args) {
		
		//Declaring TreeMap
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		
		//Adding key value pairs to TreeMap
		tmap.put(1, "Laxmi");
		tmap.put(4, "Sangeetha" );
		tmap.put(5, "Vijay");
		tmap.put(2, "Muneeb");
		tmap.put(3, "Bhagwandas");
		
		//Displaying content in TreeMap
		System.out.println("TreeMap Content: "+tmap);
		
		//Display content using Iterator
		Set set = tmap.entrySet();
		Iterator iterator = set.iterator();
		System.out.println("Iterator: ");
		while(iterator.hasNext()){
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.println("Key is: "+mentry.getKey()+" & value is: "+mentry.getValue());
		}
		
		
	}

}
