package com.java.collections.list.Vector;

import java.util.Collections;
import java.util.Vector;

public class SortingVectorExample {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		
		vector.add("INDIA");
		vector.add("USA");
		vector.add("CHINA");
		vector.add("JAPAN");
		vector.add("GREECE");
		vector.add("PORTUGAL");
		
		System.out.println("Elements in vector without sorting: "+vector);
		
		Collections.sort(vector);
		
		System.out.println("Elements in vector after sorting: "+vector);
		
		System.out.println("Elements in vector after sorting with for loop: ");
		
		for(int count=0; count<vector.size();count++){
			System.out.println(vector.get(count));
		}
		
		
		
	}

}
