package com.java.collections.list;

import java.util.ArrayList;

public class ArrayListLoopExample {

	
	
	public static void main(String[] args) {
	
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(1);
		arrlist.add(2);
		arrlist.add(3);
		arrlist.add(4);
		arrlist.add(5);
		arrlist.add(6);
		
		System.out.println("Elements in ArrayList: "+arrlist);
		
		//Iterating elements using for loop
		System.out.println("for loop");
		for(int count=0;count<arrlist.size();count++){
			System.out.println(arrlist.get(count));
		}
		
		//Iterating elements using advanced for loop
		System.out.println("Adavanced for loop");
		for(Integer num: arrlist){
			System.out.println(num);
		}
		
		//Iterating elements using while loop
		System.out.println("While loop");
		int count = 0;
		
		while(arrlist.size() > count){
			System.out.println(arrlist.get(count));
			count++;
		}
		
	}
}
