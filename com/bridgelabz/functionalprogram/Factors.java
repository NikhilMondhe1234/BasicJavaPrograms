package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;

public class Factors {
		public static void main(String arg[]) {
			
			// Initializing variables
			System.out.println("Please Enter the Number");
			int number=Utility.inputInteger();
			
			System.out.println("The Prime Factors are :");
			int output=Utility.primefactor(number);
			System.out.println(output);
	}
}
