package com.java.corejava.programsforbeginners;

import java.util.Arrays;
import java.util.Scanner;



public class SumOFArray {

//	public static void main(String[] args) {
//		
//		//Declaring an array
//		int[] array = new int[]{1,2,3,4,5};
//		
//		//different ways of array implementation
//		//int[] array = {1,2,3,4,5};
//		//int[] array = new int[5];
//		
//		int sum = 0;
//		
//		//Advanced for loop
//		for(int num: array){
//			sum = num + sum;
//		}
//		
//		System.out.println("Sum of Array is: "+sum);
//	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		int sum = 0;
		System.out.println("Enter the elements: ");
		//Storing elements in array
		for(int i = 0; i < 5; i++){
			array[i] = sc.nextInt();
		}
		
		System.out.println("Elements in array: "+Arrays.toString(array));
		//Advanced for loop
		for(int num: array){
			sum = num + sum;
		}
		System.out.println("Sum of Array is: "+sum);
	
	}
}
