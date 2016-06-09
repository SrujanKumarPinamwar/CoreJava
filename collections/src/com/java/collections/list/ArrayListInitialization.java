package com.java.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListInitialization {
	
	
	public static void intializationArraysAsList(){
		ArrayList<String> obj = new ArrayList<String>(Arrays.asList("Pratap", "Suresh", "Ramesh"));
		
		System.out.println("ArrayList elements: "+obj);
		
	}
	
	public static void intializationAnonymousInnerClass(){
		ArrayList<String> cities = new ArrayList<String>(){{
			add("Delhi");
			add("Hyderabad");
		}};
		
		System.out.println("Cities in ArrayList: " + cities);
	}
	
	public static void intializationArrayList(){
		ArrayList<String> countries = new ArrayList<String>();
		
		countries.add("India");
		countries.add("USA");
		countries.add("Dubai");

		System.out.println("Countries in ArrayList: "+countries);
	}
	
	public static void intializationCollectionsNCopies(){
		
		ArrayList<String> intList = new ArrayList<String>(Collections.nCopies(5, "Kumar"));
		
		System.out.println("intList in ArrayList: "+intList);
		
	}
	
	public static void main(String args[]){
	
		ArrayListInitialization.intializationAnonymousInnerClass();
		ArrayListInitialization.intializationArraysAsList();
		ArrayListInitialization.intializationArrayList();
		ArrayListInitialization.intializationCollectionsNCopies();
	}
}
