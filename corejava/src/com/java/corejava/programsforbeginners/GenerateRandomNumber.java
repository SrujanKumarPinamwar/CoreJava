package com.java.corejava.programsforbeginners;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		System.out.println("Generate Random number");
		int count;
		Random rnum = new Random();
		
		//Logic to generate 5 random numbers between 0 and 200
		System.out.println("Random Numbers: ");
		System.out.println("*****************");
		for(count=1;count<=5;count++){
			System.out.println(rnum.nextInt(200));
		}
		
	}

}
