package com.aniket.sorting_algorithms;

public class InsertionSort {

	//Time Complexity =  O(n^2) && space complexity = O(1)
	public int[] insertionSorting(int[] arrayToSort) {
		
		for (int i = 1; i < arrayToSort.length; i++) {
			int j = i;
			while(j > 0 && arrayToSort[j] < arrayToSort[j-1]) {
				swap(j, j-1, arrayToSort);
				j-=1;
			}
		}
		
		return arrayToSort;
	}

	public void swap(int firstIndex, int SecondIndex, int[] inputArray) {
		int temp = inputArray[firstIndex];
		inputArray[firstIndex] = inputArray[SecondIndex];
		inputArray[SecondIndex] = temp;
	}

	public static void main(String[] args) {
		InsertionSort insSort = new InsertionSort();
		int arrayToBeSorted[] = {8,5,9,1,4,6,5,2};
		insSort.insertionSorting(arrayToBeSorted);

	}

}
