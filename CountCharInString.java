package com.java.jrevisited;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;


public class CountCharInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s = "Srujan Kumar Pinamwar";
		char ch ='a', space =' ';
		int charCount = 0;
		int chCount = 0;
		
		//Character count in a string using org.apache.commons.lang3.StringUtils
		int count = StringUtils.countMatches(s, ch);
		
		System.out.println("Character count: " +count);
		
		//Character count in a string using loops
		for (int i = 0; i < s.length(); i++){
			if(s.charAt(i) == ch){
				charCount++;
			}
		}
		System.out.println("Charcount: " +charCount);
		//Character count in a string using for each loop
		for (char c: s.toCharArray()){
			if (c == ch){
				chCount++;
			}
		}
		System.out.println("Chcount: " +chCount);
		//characters count in a string using hash map
		Map<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		
		char[] charArray = s.toCharArray();
		
		for ( char c: charArray){
			if(hm.containsKey(c)){
				hm.put(c, hm.get(c)+1);
			}else if(c !=' '){
				hm.put(c, 1);
			}	
		}
		
		
		System.out.println("Char count: "+hm);
		
	}

}
