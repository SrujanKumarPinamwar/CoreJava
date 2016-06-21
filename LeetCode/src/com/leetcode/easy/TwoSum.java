package com.leetcode.easy;

import java.util.Arrays;

public class TwoSum {

	public static int[] twoSum(int[] nums,int target){
		for(int i = 0; i < nums.length; i++){
			for(int j = i + 1; j < nums.length; j++){
				if(nums[j] == target - nums[i]){
					System.out.println("i: " + i +" | j: "+j);
				
				}
				return new int[]{i,j};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,5,6};
		int target = 9;
		
		int[] solution = twoSum(nums,target);
		System.out.println("Solution: " + Arrays.toString(solution));
		
	}
}
