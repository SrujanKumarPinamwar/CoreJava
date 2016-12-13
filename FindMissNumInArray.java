package com.java.jrevisited.arrays;

import java.util.BitSet;
import java.util.Arrays;


public class FindMissNumInArray {


private static void printMissingNumbers(int[] numbers, int count) { 
    int missingCount = count - numbers.length; 
    BitSet bitSet = new BitSet(count); 
    for (int number : numbers) { 
        bitSet.set(number - 1); 
    } 

    System.out.printf("Missing numbers in integer array %s, with total number %d is %n", Arrays.toString(numbers), count); 
    int lastMissingIndex = 0; 
    for (int i = 0; i < missingCount; i++) { 
        lastMissingIndex = bitSet.nextClearBit(lastMissingIndex); 
        System.out.println(++lastMissingIndex); 
    } 
    
}


private static int printMissNumber(int[] numbers,int count){
	int sumOfArray = 0;
	int totalSum = count * ((count+1)/2);
	for (int number: numbers){
		sumOfArray += number;
	}
	return (totalSum - sumOfArray);
	
}

  public static void main(String args[]) {   
	  int[] array = new int[100];
	  int j=1;
	  for (int i = 0; i <=99;i++ ){
		  array[i] = j;
		  j++;
	  }
	  printMissingNumbers(array, 102);
	  int n =   printMissNumber(array, 101);
	  System.out.println(n);
   }
}
