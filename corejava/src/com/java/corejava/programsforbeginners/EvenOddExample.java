package com.java.corejava.programsforbeginners;

import java.util.Scanner;

public class EvenOddExample {

	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter an integer number: ");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();

		//If the number is divisible by 2 then it's an even number else odd number
		if(num % 2 == 0){
			System.out.println("Entered number is Even: "+num);
		}else{
			System.out.println("Entered number is Odd: "+num);
		}	
	}
}
