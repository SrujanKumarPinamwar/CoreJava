package com.java.corejava.programsforbeginners;

import java.util.Scanner;

public class CircleArea {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter the radius: ");
		/*We are storing the entered radius in double 
		because a user can enter radius in decimals
		*/
		double radius = in.nextDouble();
		
		//Area =  PI*radius*radius
		double area = Math.PI *(radius*radius);
		System.out.println("The area of a circle is: "+area);
		//Circumference = 2*PI*radius
		double circumference = Math.PI * 2 * radius;
		System.out.println("The circumference of a circle is: "+circumference);
	
	}

}
