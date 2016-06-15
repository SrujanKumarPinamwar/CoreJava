package com.java.corejava.programsforbeginners;

import java.util.Scanner;

/*
 Logic for Reverse Number:
 reverseNum =  reverseNum *10;
 reverseNum = reverseNum + num % 10;
 num = num/10;
 */

public class ReverseNumber {

	//A method for Reverse a number
	public static void reverseMethod(int number){
		if(number < 10){
			System.out.println(number);
		}else{
			System.out.println(number%10);
			reverseMethod(number/10);
		}
		
		
	}
	public static void main(String[] args) {
		
		int num = 0;
		int reverseNum = 0;
		 
		System.out.println("Input your number and press enter: ");
		
		//This statement will capture the user input
		Scanner in = new Scanner(System.in);
		//captured input will be stored in number num
		num = in.nextInt();
		
//		//Logic to find the reverse number
//		while(num != 0){
//			reverseNum = reverseNum * 10;
//			reverseNum = reverseNum + num%10;
//			num = num/10;
//			System.out.println("Num: "+num+" & reverseNum: "+reverseNum);
//		}
//		
//		System.out.println("Reverse of input number is: "+reverseNum);	
	
//		//Reverse a number using For Loop
//		for ( ;num != 0; ){
//		reverseNum = reverseNum * 10;
//		reverseNum = reverseNum + num%10;
//		num = num/10;
//		System.out.println("Num: "+num+" & reverseNum: "+reverseNum);
//		}
		System.out.println("For Loop reverse of input number is: ");
		reverseMethod(num);
		System.out.println();
	}

}
