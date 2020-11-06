package com.aniket.sorting_algorithms;

public class QuickSort {

	public int[] quickSorting(int [] inputArray) {
		quickSortHepler(inputArray,0,inputArray.length-1);
		return inputArray;
	}


	private void quickSortHepler(int[] arrayInput, int startIndex, int endIndex) {
		if(startIndex >= endIndex)
			return;
		
		int pivot = startIndex;
		int leftIndex = startIndex + 1;
		int rightIndex = endIndex;

		while(rightIndex >= leftIndex) {

			if(arrayInput[leftIndex] > arrayInput[pivot] && arrayInput[rightIndex] < arrayInput[pivot]) 
				swap(leftIndex, rightIndex, arrayInput);

			if(arrayInput[leftIndex] <= arrayInput[pivot])
				leftIndex++;

			if(arrayInput[rightIndex] >= arrayInput[pivot])
				rightIndex--;

		}

		swap(pivot, rightIndex, arrayInput);

		boolean isLeftSubArraySamller = (rightIndex - 1 - startIndex) < (endIndex - (rightIndex + 1));

		if(isLeftSubArraySamller) {
			quickSortHepler(arrayInput , startIndex, rightIndex - 1);
			quickSortHepler(arrayInput , rightIndex + 1 , endIndex);
		}
		else {
			quickSortHepler(arrayInput , rightIndex + 1 , endIndex);
			quickSortHepler(arrayInput , startIndex, rightIndex - 1);
		}

	}

	public void swap(int firstIndex, int SecondIndex, int[] inputArray) {
		int temp = inputArray[firstIndex];
		inputArray[firstIndex] = inputArray[SecondIndex];
		inputArray[SecondIndex] = temp;
	}


	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		int arrayToBeSorted[] = {8,5,9,1,4,6,5,2};
		qs.quickSorting(arrayToBeSorted);

	}

}
