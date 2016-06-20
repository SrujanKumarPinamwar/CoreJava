package com.java.corejava.programsforbeginners;

public class FactorialNumber {

	public static void main(String[] args) {

		int num=5;
		
		int factorial = num;
		
		  for(int i =(num - 1); i > 1; i--)
          {
                  factorial = factorial * i;
          }
 
          System.out.println("Factorial of a number is " + factorial);
	}

}
