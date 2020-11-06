package com.aniket.searching_algorithms;

public class BinarySearch{
	
	//Time Complexity O(log n) | Space complexity O(1)
	public int binarySearching(int[] arrayToBeSearched, int value){
		int leftIdx = 0;
		int rightIdx = arrayToBeSearched.length-1;
		
		while(leftIdx <= rightIdx){
			int midIdx  = (leftIdx + rightIdx) /2;
			if(arrayToBeSearched[midIdx] == value)
				return midIdx;
			
			else if (arrayToBeSearched[midIdx] > value){
				rightIdx = midIdx - 1;
			}
			
			else if (arrayToBeSearched[midIdx] < value){
				leftIdx = midIdx + 1;
			}
			
		}
		
		return -1;
		
	}
	
	
	public static void main(String args[]){
		int inputArray[] = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
		BinarySearch bs = new BinarySearch();
		int index = bs.binarySearching(inputArray, 33);
		System.out.println(index);
		
		int index1 = bs.binarySearching(inputArray, 74);
		System.out.println(index1);
	}
}
