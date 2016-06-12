package com.java.collections.list.Vector;

import java.util.Collections;
import java.util.Enumeration;
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
		vector.add("USA");
		vector.add("INDIA");
		vector.add("DUBAI");
		vector.add("INDIA");
		vector.add("CHINA");
		vector.add("USA");
		vector.add("INDIA");
		vector.add("USA");
		vector.add("CHINA");
		vector.add("USA");
		vector.add("RUSSIA");
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
			
		//Iterating elements using enumeration
			
		System.out.println("Enumeration ");
			Enumeration enumeration = Collections.enumeration(vector);
			
			while(enumeration.hasMoreElements()){
				System.out.println(enumeration.nextElement());
			}
			
			System.out.println("Vector: "+vector);
			System.out.println("Sublist of a vector: "+ vector.subList(1, 3).get(1));
			
			//Search elements in vector using index 
			System.out.println("First occurrence of INDIA:  "+vector.indexOf("INDIA"));
			System.out.println("Occurence of INDIA after: "+vector.indexOf("INDIA",2));
			System.out.println("First occurrence of RUSSIA: "+vector.indexOf("RUSSIA"));
			System.out.println("Occurence of RUSSIA after: "+vector.indexOf("RUSSIA",2));

			
			
			
			//Copying elements of one vector into another vector
			
			Vector<String> vector1 = new Vector<String>();

			vector1.add("INDIA");
			vector1.add("USA");
			vector1.add("CANADA");
			vector1.add("JAMAICA");
			vector1.add("GREECE");
			
			Vector<String> vector2 = new Vector<String>();
			vector2.add("RUSSIA");
			vector2.add("MALAYSIA");
			vector2.add("SINGAPORE");
			vector2.add("BANGKOK");
			vector2.add("GREECE");
			
			System.out.println("Elements of vector2: "+vector2);
			
			Collections.copy(vector2, vector1);

			System.out.println("Elements of vector2 after copying from vector: "+vector2);
			
			
			
			
		}
		
		
		
		
	}

}
