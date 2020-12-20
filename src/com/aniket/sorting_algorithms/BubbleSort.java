package com.aniket.sorting_algorithms;

public class BubbleSort {
	
	//Time Complexity =  O(n^2) && space complexity = O(1)
	public int[] bubbleSorting(int[] arrayToSort) {
		boolean isSorted = false;
		while(!isSorted) {
			isSorted = true;
			for (int i = 0; i < arrayToSort.length-1; i++) {
				if(arrayToSort[i]>arrayToSort[i+1]) {
					swap(i,i+1,arrayToSort);
					isSorted = false;
				}
			}
			
		}
		return arrayToSort;
	}
	
	
	/* MOAT optimized -- now instead of going to the n-1 position every time we will ignore 
	 * the last index set by the previous step. This is because after every iteration the biggest numbers 
	 * will get pushed to the last.
	 * 
	 * For example : 
	 * Input Array :         8,5,9,1,4,6,5,2
	 * After 1st iteration : 5,8,1,4,6,5,2,[9] -- after 1st iteration the biggest number that is 9 is at last index (its final position). So for next iteration we can ignore the last index
	 * After 2nd iteration : 5,1,4,6,5,2,[8,9] -- after 2nd iteration the biggest number that is 8 is send to its final position. so for nect iteration we will ignore last & second-last index.
	 */
	public int[] bubbleSortingOptimized(int[] arrayToSort) {
		boolean isSorted = false;
		int counter = 0;
		while(!isSorted) {
			isSorted = true;
			for (int i = 0; i < arrayToSort.length-1-counter; i++) {
				if(arrayToSort[i]>arrayToSort[i+1]) {
					swap(i,i+1,arrayToSort);
					isSorted = false;
				}
			}
			counter++;
			
		}
		return arrayToSort;
	}
	
	public void swap(int firstIndex, int SecondIndex, int[] inputArray) {
		int temp = inputArray[firstIndex];
		inputArray[firstIndex] = inputArray[SecondIndex];
		inputArray[SecondIndex] = temp;
	}
	
	

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int arrayToBeSorted[] = {8,5,9,1,4,6,5,2};
		bs.bubbleSorting(arrayToBeSorted);
		
		int arrayToBeSorted2[] = {8,5,9,1,4,6,5,2};
		bs.bubbleSortingOptimized(arrayToBeSorted2);

	}

}
