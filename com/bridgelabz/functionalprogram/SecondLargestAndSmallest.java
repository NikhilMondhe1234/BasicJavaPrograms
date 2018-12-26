package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;

public class SecondLargestAndSmallest {
	public static void main(String arg[])
	{
		System.out.println("Enter the size element you want in array");
		int size=Utility.inputInteger();
		int array[]= new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<array.length;i++)
		{
			array[i]=Utility.inputInteger();
		}
		int largest = Utility.print2Largest(array,size);
		System.out.println("The Second largest element in an array is :"+largest);
		int smallest = Utility.print2Smallest(array,size);
		System.out.println("The Second Smallest element in an array is :"+smallest);
	}
}
