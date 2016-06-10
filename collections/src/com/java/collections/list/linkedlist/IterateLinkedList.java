package com.java.collections.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateLinkedList {

	public static void main(String[] args) {


		LinkedList<Integer> intlist = new LinkedList<Integer>();
		
		intlist.add(1);
		intlist.add(2);
		intlist.add(3);
		intlist.add(4);
		intlist.add(5);
		
		System.out.println("Elements in Linked List: "+ intlist);
		
		//Iterating elements using for loop
		System.out.println("For Loop ");
		for(int count=0; count < intlist.size(); count++  ){
			System.out.println(intlist.get(count));
		}
		
		//Iterating elements using advance for loop
		System.out.println("Advanced for loop");
		for(Integer num:intlist){
			System.out.println(num);
		}
		
		//Iterating elements using while loop
		System.out.println("While Loop");
		
		int count = 0;
		while(intlist.size()>count){
			System.out.println(intlist.get(count));
			count++;
		}
		
	
		Iterator iterator = intlist.iterator();
		System.out.println("Iterating using Iterator");
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}

}
