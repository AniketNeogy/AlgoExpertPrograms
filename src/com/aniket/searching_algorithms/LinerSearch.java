package com.aniket.searching_algorithms;

public class LinerSearch {
 
	//Time Complexity O(n) | Space complexity O(1)
	public int linearSearching(int[] arrayToBeSearched, int value){
		for (int i = 0; i < arrayToBeSearched.length; i++) {
			if(arrayToBeSearched[i] == value)
				return i;
		}
		return -1;
	}
	
	
	public static void main(String args[]){
		int inputArray[] = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
		LinerSearch ls = new LinerSearch();
		int index = ls.linearSearching(inputArray, 33);
		System.out.println(index);
		
		int index1 = ls.linearSearching(inputArray, 74);
		System.out.println(index1);
	}

}
