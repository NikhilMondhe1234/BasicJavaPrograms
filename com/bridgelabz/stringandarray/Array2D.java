package com.bridgelabz.stringandarray;

import com.bridgelabz.utility.Utility;

public class Array2D {

	public static void main(String[] args) {
		{
			System.out.println("enter your choice, which type of values you want to store in the array");
			System.out.println("Type 1 for integer");
			System.out.println("Type 2 for double");
			System.out.println("Type 3 for boolean");
			int n=Utility.inputInteger();
			Utility.print2DArray(n);
		}
	}
}
