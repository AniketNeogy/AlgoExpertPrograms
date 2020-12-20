package com.aniket.arrays;

public class NumberOfWaysToMakeChange {

	private int findNumberOfWaysToMakeChange(int[] denominations, int targetAmount) {
		int ways[] = new int[targetAmount+1];

		ways[0] = 1;

		for (int denom : denominations) {
			for (int amount = 1; amount < targetAmount+1; amount++) {
				if(denom <= amount)
					ways[amount] = ways[amount] + ways[amount-denom];
			}

		}
		
		return ways[targetAmount];
	}

	public static void main(String[] args) {
		NumberOfWaysToMakeChange nc = new NumberOfWaysToMakeChange();
		int[] denominations = {1,5,10,25};
		int targetAmount = 10;
		System.out.println(nc.findNumberOfWaysToMakeChange(denominations,targetAmount));

	}

}
