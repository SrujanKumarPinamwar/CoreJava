package com.java.jrevisited;

public class StringPermutation {

	/** * Java program to find all permutations of a given String using recursion. 
	 * For example, given a String "XYZ", this program will print all 6 possible permutations of 
	 * input e.g. XYZ, XZY, YXZ, YZX, ZXY, XYX 
	 */

	
	public static void main(String[] args) {
		
		String s = "123";
		
		//System.out.println("Substring: "+s.substring(1,2));
		permutation(s);
	}

	public static void permutation(String s) {
		permutation("", s);	
	}

	

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}

}
