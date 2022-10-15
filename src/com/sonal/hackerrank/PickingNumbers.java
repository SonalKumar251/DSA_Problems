package com.sonal.hackerrank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PickingNumbers {
	/*
	 * Given an array of integers, find the longest subarray where the absolute 
	 * difference between any two elements is less than or equal to 1.
	 */
	public static int pickNumbers(List<Integer> a) {
		a.sort(Comparator.naturalOrder());
		int maxSubArr = 0 , count = 0 , currIndex = 0;
		boolean allEqual = true;
		for(int i = 0 ; i<a.size() ; i++) {
			//System.out.println(a.get(currIndex)+" - "+a.get(i));
			int diff = Math.abs(a.get(currIndex) - a.get(i));
			if(diff <= 1) count++;
			else {
				currIndex = i ;
				i--; //set loops index back to current index to get actual count
				maxSubArr = count > maxSubArr ? count : maxSubArr ;	
				count = 0;
				allEqual = false;
			}
			if(allEqual) 
				maxSubArr = count ;
		}
		
		return maxSubArr;
	}
	
	public static void main(String[] args) {
		
		System.out.println(PickingNumbers.pickNumbers(Arrays.asList(66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66))); // [1 2 2]  [3 3 3 4]  5
	}
}
