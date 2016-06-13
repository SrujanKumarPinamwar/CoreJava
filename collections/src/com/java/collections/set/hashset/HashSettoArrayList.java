package com.java.collections.set.hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSettoArrayList {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		
		hset.add("USA");
		hset.add("INDIA");
		hset.add("DUBAI");
		hset.add("FRANCE");
		hset.add("SPAIN");
		hset.add("SWITZERLAND");

		System.out.println("Elements in HashSet: "+hset);
		
		//Converting HashSet into ArrayList
		
		ArrayList<String> arrlist = new ArrayList<String>(hset);
		
		System.out.println("Elements in ArrayList : "+arrlist);
		
		

	}

}
