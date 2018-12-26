package com.bridgelabz.stringandarray;
import com.bridgelabz.utility.Utility;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("Enter the size of array you want to store");
		int size=Utility.inputInteger();
		int[] input =new int[size];
		System.out.println("Please Enter the number list :");
		for(int i=0;i<size;i++)
		{
			input[i]=Utility.inputInteger();
		}
		input=Utility.bubbleSort(input);
		System.out.println("The sorted list using Bubble sort is:");
		for(int i=0;i<5;i++)
		{
			System.out.println(input[i]);
		}
	}
} 