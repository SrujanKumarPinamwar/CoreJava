package com.java.collections.set.treeset;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String args[]){
		//declaring TreeSet
		TreeSet<String> tset = new TreeSet<String>();
		
		//Adding elements in TreeSet
		tset.add("Texas");
		tset.add("NewYork");
		tset.add("California");
		tset.add("Arizona");
		tset.add("Nevada");
		tset.add("UTAH");
		tset.add(null);
		
		System.out.println("Elements in tset: "+tset);
		
		TreeSet<Integer> tset2 = new TreeSet<Integer>();
		
		tset2.add(55);
		tset2.add(49);
		tset2.add(18);
		tset2.add(42);
		tset2.add(43);
		tset2.add(7);
		
		System.out.println("Elements in TreeSet 2: "+tset2);
	}
	
}
