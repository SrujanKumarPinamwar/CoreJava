package com.java.corejava.programsforbeginners;

import java.util.Scanner;

public class PrimeNumberExample {

	public static void main(String[] args) {
		
		int temp;
		boolean isPrime = true;
		int num;
		System.out.println("Enter an integer number: ");
		Scanner input = new Scanner(System.in);
		//Capture the input in an integer
		num = input.nextInt();
		
		for(int i=2; i <= num / 2; i++){
			
			temp = num%i;
			if(temp == 0){
				isPrime = false;
				break;
			}
		}
		//if isPrime is true thenn the number is prime else not
		if(isPrime){
			System.out.println(num+" is a Prime number");
		}else{
			System.out.println(num+" is not a prime number");
		}

	}

}


