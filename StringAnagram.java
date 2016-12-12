package com.java.jrevisited;

import java.util.Arrays;

import com.ibm.xtq.ast.nodes.Sort;

public class StringAnagram {

	/**
	 * @param args
	 */
	
	
	
	public static boolean isAnagram(String s1, String s2){
		
		char[] ch1 = s1.toLowerCase().toCharArray();
		char[] ch2 = s2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if (ch1.length == ch2.length){
			for (int i =0; i < ch1.length; i++){
				if (ch1[i] != ch2[i]){
					return false;
				}
			}
			return true;
		}
		
		
		return false;
	}
	
	public static void main(String[] args) {
		
		String  s1 = "srujan";
		String s2 = "najurs";
		
		boolean result = isAnagram(s1,s2);
		System.out.println("Is Anagram: "+result);
		
		
	}

}
