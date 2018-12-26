package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		int decimal = Integer.parseInt(args[0]);
		String binary= Utility.decimalToBinary(decimal);
		System.out.println("The binary value of " + decimal + " is :"+binary);
	}//change the four bit
}

