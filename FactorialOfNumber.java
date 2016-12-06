package com.java.jrevisited;

public class FactorialOfNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int n = 5;
		double result = 1;
		
		/*** Factorial using for loop***/
//		for (int i = n; i > 0; i--){
//			result = result * i;
//		}
		
		for(int i = 1; i <= n; i++){    
			result=result*i;    
		}
		
		long recursiveFactorial = factorial(5);
		
		System.out.println(result);	
		System.out.println(recursiveFactorial);
	}

	/***Factorial using recursive method.***/
	public static long factorial(int n){
		if(n == 1) return 1;
		return n * factorial(n-1);
	}
	
	
}
