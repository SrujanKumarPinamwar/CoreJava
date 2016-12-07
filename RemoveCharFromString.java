package com.java.jrevisited;

import java.util.Arrays;

public class RemoveCharFromString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "srzujan kuzmar pzinamwar";
		char remChar =  'z';
	
		//using loops
		String afterDelChar = removeChar(s, remChar);
		System.out.println("After using loops: "+ afterDelChar);
		
		//Using regular expression 
		//String s1 = s.replaceAll("[z]", "");
		//System.out.println(s1);
		
		//using recursion
		String stringAfterRecursion = removeCharUsingRecursion(s, remChar);
		System.out.println("After recursioning: "+stringAfterRecursion);
	}

	//removing char from String using loops and string builder
	private static String removeChar(String s, char remChar) {
		StringBuilder sb = new StringBuilder();
		char[] charArray = s.toCharArray();
		
		for (char c: charArray){			
			if(c!=remChar){
				sb.append(c);
			}
		}
		return sb.toString();
	}
	
	//removing char from String using recursion
	private static String removeCharUsingRecursion(String s, char remChar) {
		
		int index = s.indexOf(remChar);
		
		if(index == -1){
			return s;
		}
		 
		return removeCharUsingRecursion(s.substring(0, index) + s.substring(index+1), remChar);
		
	}
	
}
