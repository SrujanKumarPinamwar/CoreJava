package com.java.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class ArrayListWithEnumeration {

	
	
	public static void main(String args[]){
		
		ArrayList<String> arrlist = new ArrayList<String>();
		
		arrlist.add("C");
		arrlist.add("C++");
		arrlist.add("JAVA");
		arrlist.add("SQL");
		arrlist.add("DOTNET");
		
		Enumeration<String> enumeration = Collections.enumeration(arrlist);
		
		while(enumeration.hasMoreElements())
			System.out.println(enumeration.nextElement());
		
		System.out.println("\n"+"Size: "+ arrlist.size());
		
	}
	
	
}
