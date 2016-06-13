package com.java.collections.set.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhset = new LinkedHashSet<String>();
		
		lhset.add("INDIA");
		lhset.add("USA");
		lhset.add("CHINA");
		lhset.add("JAPAN");
		lhset.add("KOREA");
		lhset.add("RUSSIA");
		lhset.add("IRAN");
		
		System.out.println("Elements on LinkedHashSet1: "+lhset);
		
		LinkedHashSet<Integer> lhset2 = new LinkedHashSet<Integer>();
		
		lhset2.add(1);
		lhset2.add(2);
		lhset2.add(3);
		lhset2.add(4);
		lhset2.add(5);
		lhset2.add(6);
		
		System.out.println("Elements in LinkedHashSet2: "+lhset2);

	}

}
