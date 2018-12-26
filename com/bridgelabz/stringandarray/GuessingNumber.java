package com.bridgelabz.stringandarray;

import com.bridgelabz.utility.Utility;

public class GuessingNumber {
	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		int n=Utility.inputInteger();
		System.out.println("is ");
		int low=0;
		int high=n-1;
		int item=Utility.search(low,high);
		System.out.println("the number is "+item);
	}
}		
