package com.java.collections.set.hashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConvertHashSettoTreeSet {

	
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
	hset.add("Orange");
	//hset.add(null);
		
		System.out.println("Elements in HashSet: "+hset);
		
		
		Set<String> tset =  new TreeSet<String>(hset);
		System.out.println("Elemnets in TreeSet");
		for(String temp: tset){
			System.out.println(temp);
		}
		

	}
}