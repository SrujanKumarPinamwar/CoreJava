package com.java.jrevisited;

public class StringToInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "123";
		
		int n =  Integer.parseInt(s1);
		
		String string = String.valueOf(n);
		System.out.println("String: "+string);
		
		int n1= Integer.valueOf(s1);
		
		System.out.println(n1);
	}

}
