package com.java.collections.list.linkedlist;

import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		LinkedList<String> obj = new LinkedList<String>();
	
		//Adding elements to Linked List
		obj.add("Item1");
		obj.add("Item2");
		obj.add("Item3");
		obj.add("Item4");
		obj.add("Item5");
		obj.add("Item6");
		
		
		//Displaying elements in Linked List
		System.out.println("Elements in LinkedList:" + obj);
		
		//Add first and last element
		obj.addFirst("First Item");
		obj.addLast("Last Item");
		
		System.out.println("Linked List after addition: "+obj);
		
		//get and set values
		
		String firstVar = obj.get(0);
		System.out.println("First Element: "+ firstVar);
		
		obj.set(0, "Changed first element");
		String firstVar2 =  obj.get(0);
		System.out.println("first element after set method: "+firstVar2);
		
		
		//Remove first and last element 
		obj.removeFirst();
		obj.removeLast();
		System.out.println("Linked List after deletion of first and last element: "+obj);
		
		//Add to a position and remove from position
		obj.add(0, "Newly added first element");
		obj.remove(2);
		System.out.println("Final Linked List after adding and removing element: "+obj);
		
		
		
		
		
	}

}
