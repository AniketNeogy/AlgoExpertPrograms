package com.aniket.sorting_algorithms;

public class SelectionSort {
	
	//Time Complexity =  O(n^2) && space complexity = O(1)
	public int[] selectionSorting(int[] arrayToSort) {
		int currentIdxOfUnsortedList = 0;
		while(currentIdxOfUnsortedList < arrayToSort.length-1) {
			int smallestIndex = currentIdxOfUnsortedList;
			for (int i = currentIdxOfUnsortedList + 1 ; i < arrayToSort.length ; i++) {
				if(arrayToSort[smallestIndex] > arrayToSort[i]) 
					smallestIndex = i;
			}
			swap(currentIdxOfUnsortedList, smallestIndex, arrayToSort);
			currentIdxOfUnsortedList += 1;
		}
		return arrayToSort;
	}
	
	//Another implementation using 2 for loops instead of while and for
	public int[] selectionSorting2(int[] arrayToSort) {
		for (int i = 0; i < arrayToSort.length-1; i++) {
			int smallestIndex = i;
			for (int j = i+1; j < arrayToSort.length; j++) {
				if(arrayToSort[smallestIndex] > arrayToSort[j])
					smallestIndex = j;
			}
			swap(i, smallestIndex, arrayToSort);
		}
		return arrayToSort;
	}
	
	public void swap(int firstIndex, int SecondIndex, int[] inputArray) {
		int temp = inputArray[firstIndex];
		inputArray[firstIndex] = inputArray[SecondIndex];
		inputArray[SecondIndex] = temp;
	}

	public static void main(String[] args) {
		SelectionSort selSort = new SelectionSort();
		int arrayToBeSorted[] = {8,5,9,1,4,6,5,2};
		selSort.selectionSorting(arrayToBeSorted);
		
		int arrayToBeSorted2[] = {8,5,9,1,4,6,5,2};
		selSort.selectionSorting2(arrayToBeSorted2);
	}

}
