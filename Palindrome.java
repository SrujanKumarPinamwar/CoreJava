package com.java.jrevisited;

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/***Reverse the string using StringBuffer.***/
//		String word = "hello world";
//		String reverse = new StringBuffer(word).reverse().toString();
//		System.out.printf("Original String: %s, Reversed String: %s",word,reverse);
		
		
		/***Reverse the string using StringBuilder.***/
//		String word = "hello world";
//		String reverse = new StringBuilder(word).reverse().toString();
//		System.out.printf("Original String: %s, Reversed String: %s",word,reverse);
		
		/***Reverse the string without using StringBuffer or StringBuilder.***/
//		String word = "srujan";
//		String reverse = reverse(word);
//		System.out.printf("Original String: %s, Reversed String: %s",word,reverse);
		
		/***Reverse the string  using Iterative method.***/
//		String word = "srujan kumar pinamwar";
//		String reverse = reverseUsingIterative(word);
//		System.out.printf("Original String: %s, Reversed String: %s",word,reverse);
		
		/***Reverse the string using Recursive method.***/
		String word = "srujan";
		String reverse = reverseUsingRecursive(word);
		System.out.printf("Original String: %s, Reversed String: %s%n",word,reverse);
		
		if (word.equals(reverse)){
			System.out.println("Given String is palindrome. ");
		}else{
			System.out.println("Given String is not plindrome. ");
		}
		
		
	}

	
	private static String reverseUsingRecursive(String word) {
		
		if (word.length()<2){
			return word;
		}
		
		return reverseUsingRecursive(word.substring(1))+ word.charAt(0);
	}


	public static String reverseUsingIterative(String str) {

        StringBuilder strBuilder = new StringBuilder();
        char[] strChars = str.toCharArray();

        for (int i = strChars.length - 1; i >= 0; i--) {
        	strBuilder.append(strChars[i]);
        }
        return strBuilder.toString();
    }

	
	private static String reverse(String word) {
		
		if(word == null || word.isEmpty()){
			return word;
		}
		
		String reverse ="";
		for(int i = word.length() - 1; i >= 0; i--){
			reverse += word.charAt(i);
		}
		
		return reverse;
	}

}
