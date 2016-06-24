package com.java.arrays;

import java.util.Arrays;


public class EvenOdd {
	
	public static  int[] evenOdd(int[] A){
		int nextEven = 0, nextOdd = A.length - 1;
		while(nextEven < nextOdd){
			if ( A[nextEven] % 2 == 0){
				nextEven++;
				System.out.println("nextEven: "+nextEven+" | nextOdd: "+nextOdd);
				System.out.println("value in if Block A[nextEven]: "+A[nextEven]);
				System.out.println("Array: " + Arrays.toString(A));
			}else{
				System.out.println("nextEven: "+nextEven+" | nextOdd: "+nextOdd);
				int temp = A[nextEven];
				System.out.println("Temp: "+temp);
				A[nextEven] = A[nextOdd];
				System.out.println("A[Even] "+A[nextEven]);
				System.out.println("A[Odd] "+A[nextOdd]);
				A[nextOdd--] = temp;
				System.out.println("nextOdd Value: "+nextOdd);
				System.out.println("Array: " + Arrays.toString(A));
				//System.out.println("A[nextEven]: "+A[nextEven]+" | A[nextOdd]: "+A[nextOdd]+" | temp: " + temp+" |A[nextOdd--]: "+A[nextOdd--]);
			}
			System.out.println("nextEven: "+nextEven+" | nextOdd: "+nextOdd);
			System.out.println("A[nextEven]: "+A[nextEven]+" | A[nextOdd]: "+A[nextOdd]);
	}
		return A;
}
	
	public static void main (String args[]){
	
		int[] A = {1,2,3,4,5,6};
		evenOdd(A);
		System.out.println("Array: " + Arrays.toString(A));
	}
}
	
