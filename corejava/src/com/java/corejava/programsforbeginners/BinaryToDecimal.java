package com.java.corejava.programsforbeginners;

import java.util.Scanner;

public class BinaryToDecimal {	
	
	public int BinaryToDecimalConversion(int binaryNumber){
		int decimal =0, p=0;
		
		while(true){
			if(binaryNumber == 0){
				break;
			}else{
				int temp = binaryNumber%10;
				decimal += temp*Math.pow(2, p);
				binaryNumber = binaryNumber/10;
				p++;
			}	
		}
		return decimal;
	}

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
//		System.out.println("Enter Binary Number: ");
//		String str = input.nextLine();
//		System.out.println("Output: "+Integer.parseInt(str, 2));

		BinaryToDecimal btd = new BinaryToDecimal();
		System.out.println("1111 ---> "+btd.BinaryToDecimalConversion(1111));
	}

}
