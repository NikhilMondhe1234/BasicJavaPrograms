package com.bridgelabz.stringandarray;

import com.bridgelabz.utility.Utility;

public class MergeSort {

	public static void main(String[] args) {
		System.out.println("Enter the size of array you want to store");
		int size=Utility.inputInteger();
		int[] input =new int[size];
		System.out.println("Please Enter the number list :");
		for(int i=0;i<size;i++)
		{
			input[i]=Utility.inputInteger();
		}
		System.out.println("The Given array is :");
		Utility.printArray(input);
		Utility.sort(input, 0, input.length-1);
		System.out.println("\nThe Sorted array is :"); 
        Utility.printArray(input); 
	}
}
