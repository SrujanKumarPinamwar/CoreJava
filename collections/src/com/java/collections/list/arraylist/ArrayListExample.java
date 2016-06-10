package com.java.collections.list.arraylist;

import java.util.ArrayList;

public class ArrayListExample {
 
	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();
		
		//Adding elements to the ArrayList
		obj.add("Harry");
		obj.add("Sam");
		obj.add("Scott");
		obj.add("Natty");
		obj.add("Sandy");
		
		//Displaying ArrayList elements
		System.out.println("Currently the array list has following elements: "+obj);
		
		//Adding elements at the given index
		obj.add( 0, "jimmy");
		obj.add( 1, "justin");
		
		//Removing elements from ArrayList
		obj.remove("Scott");
		obj.remove("Sandy");
		
		System.out.println("Currently ArrayList is: "+obj);
		
		obj.set(1, "kumar");
		System.out.println("Currently ArrayList is: "+obj.size());
		
		System.out.println("Contains: "+obj.contains("kumar"));
		
		System.out.println("Contains: "+obj.remove("kumar"));
		
		obj.clear();
		
		System.out.println("Currently ArrayList is: "+obj);
		
		
		
		
	}

}
