package com.java.corejava.programsforbeginners;

import java.util.Scanner;

public class TraingleArea {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the width of the Traingle: ");
		
		double width = sc.nextDouble();
		System.out.println("Enter the Height of the Traingle: ");
		double height = sc.nextDouble();
		
		//Area =  (width*height)/2
		double area = (width * height) / 2;
		System.out.println("The Area of a traingle: "+area);
		
	}

}
