package com.java.corejava.programsforbeginners;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharInString {

	public void countDupChars(String str){
		//Create a HashMap
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		//Convert the String into character array
		char[] chars = str.toCharArray();
		
		System.out.println("Char Array: "+Arrays.toString(chars));
		
		/* Logic: Chars are inserted as keys and their count as 
		 * values. If map contains the char already
		 * then increase the value by 1 
		 * */
		for(Character ch:chars){
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
			}else{
				map.put(ch, 1);
			}
		}
		
		Set<Character> keys = map.keySet();
		
		//Display count of chars if it is greater than one.
		//All duplicate characters would be having value greater than one 
		
		for(Character ch:keys){
			if(map.get(ch)>1){
				System.out.println("Char: "+ch+" "+map.get(ch));
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		DuplicateCharInString obj = new DuplicateCharInString();
		
		System.out.println("String: BeginnersBook.com");
		System.out.println("*************************");
		
		obj.countDupChars("BeginnersBook.com");
		
		System.out.println("                                ");
		System.out.println("String: Srujan Kumar Pinamwar");
		System.out.println("*************************");
		
		obj.countDupChars("Srujan Kumar Pinamwar");
		
		
		

	}

}
