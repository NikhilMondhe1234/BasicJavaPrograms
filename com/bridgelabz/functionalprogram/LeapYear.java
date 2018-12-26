package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;

public class LeapYear {

	public static void main(String[] args)
	{	
		// Initializing variables
		System.out.println("Enter a leap year:");
		int year=Utility.inputInteger();
		System.out.println(Utility.checkLeapYear(year));
	}
}

