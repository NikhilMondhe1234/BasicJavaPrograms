package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;

public class Sin {
	public static void main(String args[])
	{
		System.out.println("Enter the number of terms");
		int number =Utility.inputInteger();
		System.out.println("Enter the value of theta");
		int theta = Utility.inputInteger();
		double output=Utility.sinTaylor(number, theta);
		System.out.println(output);
	}
}