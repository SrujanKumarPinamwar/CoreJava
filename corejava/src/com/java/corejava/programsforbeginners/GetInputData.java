package com.java.corejava.programsforbeginners;

import java.util.Scanner;

public class GetInputData {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		//Get input String
		System.out.println("String input: ");
		String string = input.nextLine();
		System.out.println("Integer input: ");
		int intNumber = input.nextInt();
		System.out.println("Float input: ");
		float floatNumber = input.nextFloat();
		
	}

}
