package com.java.corejava.programsforbeginners;

import java.util.Scanner;

public class LinearSearchExample {

	public static void main(String[] args) {
		int num, item, counter, array[];
		//To capture user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		num = input.nextInt();
		//Creating array to store all the elements
		array = new int[num];
		System.out.println("Enter "+num+" elements");
		
		//Loop to store each numbers in array
		for (counter = 0; counter <num; counter++){
			array[counter] = input.nextInt();
		}
		
		System.out.println("enter the search value: ");
		item = input.nextInt();
		
		for(counter=0; counter<num; counter++){
			if(array[counter]==item){
				System.out.println(item+" is present at location: "+(counter+1));
				break;
			}
		}
		if(counter == num){
			System.out.println(item+" doesn't exist in array");
		}
	}

}
