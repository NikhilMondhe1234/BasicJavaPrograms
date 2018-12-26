package com.bridgelabz.stringandarray;

import com.bridgelabz.utility.Utility;

public class HarmonicNumberArray {
	public static void main(String arg[])
	{
		System.out.println("Enter the number of series you want");
		int number=Utility.inputInteger();
		Utility.printHarmonicSeries(number);
	}
}