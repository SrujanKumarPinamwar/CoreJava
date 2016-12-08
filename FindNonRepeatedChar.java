package com.java.jrevisited;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindNonRepeatedChar {

	//To find the first non repeated character of a string
	public static char toFindNonRepeatedChar(String s){
		Map<Character,Integer> counts = new LinkedHashMap<Character, Integer>();
		char[] ch = s.toCharArray();
		
		for (char c: ch){
			counts.put(c, counts.containsKey(c) ? counts.get(c)+1 : 1);
		}
		
		for (Entry<Character,Integer> entry : counts.entrySet()){
			
			if(entry.getValue() == 1){
				return entry.getKey();
			}
		}
		throw new RuntimeException("didn't find any non repeated Character");	
	}
	
	
	
	public static void main(String[] args){
		try{
			char ch = toFindNonRepeatedChar("srujansrujan");
			System.out.println("Character: "+ch);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
}
