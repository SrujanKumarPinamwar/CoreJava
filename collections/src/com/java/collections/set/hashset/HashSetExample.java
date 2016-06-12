package com.java.collections.set.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		//HashSet declaration
		HashSet<String> hset = new HashSet<String>();
		
		//Adding elements to hashset
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Banana");
		hset.add("Strawberry");
		hset.add("Orange");

		//Addition of duplicate elements
		hset.add("Mango");
		hset.add("Grapes");
		
		//Addition of null values
		//hset.add(null);
		//hset.add(null);
		
		//Displaying hashset elements
		System.out.println("Elements in hashset: "+hset);
		
		//Iterating elements in hashset using advanced for loop
		System.out.println("Advanced for loop");
		for(String temp: hset){
			System.out.println(temp);
		}
		
		
		
		
		//Iterating elements in hashset using Iterator
		System.out.println("Iterator");
		
		Iterator<String> iterator = hset.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.println("Hashset size: "+hset.size());

		//converting hashset to array
		
		String[] hsetArray = new String[hset.size()];
		
		hset.toArray(hsetArray);
		
		System.out.println("Hashset Array: "+Arrays.toString(hsetArray));
		
		//Displaying Array elements
		System.out.println("Advanced for loop");
		
		for(String temp: hsetArray){
			System.out.println(temp);
		}
		

		//Converting hashset to treeset
		Set<String> tset = new TreeSet<String>(hset);
		
		System.out.println("TreeSet elements: "+tset);
		 
		for(String temp: tset){
			System.out.println(temp);
		}
		
		//Deleting hashset elements
		hset.clear();
		
		System.out.println("Elements in hashset after deletion: "+hset);
		
		
	}

}
