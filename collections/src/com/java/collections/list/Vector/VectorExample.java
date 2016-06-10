package com.java.collections.list.Vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		//Vector<String> vector = new Vector<String>();
		
		Vector<String> vector = new Vector<String>();
		vector.add("USA");
		vector.add("INDIA");
		vector.add("CHINA");
		vector.add("RUSSIA");
		vector.add("DUBAI");
		
		System.out.println("Elements in Vector: "+vector);
		System.out.println("Size of Vector: "+vector.size());
		
		vector.addElement("JAPAN");
		vector.remove("CHINA");
		
		System.out.println("Elements in Vector: "+vector);
		
		//Iterating elements using for loop
		System.out.println("For loop");
		for(int count = 0; count < vector.size(); count++){
			System.out.println(vector.get(count));
			
		//Iterating elements using iterator
			System.out.println("Iterator");
			Iterator iterator = vector.iterator();
			while(iterator.hasNext()){
				System.out.println(iterator.next());
			}
			
			
			
			
			
		}
		
		
		
		
	}

}
