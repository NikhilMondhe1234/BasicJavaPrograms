package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;

public class Quadratic {
	
	public static void main(String[] args) {
		System.out.println("Enter the The values of a,b and c");
		int a=Utility.inputInteger();
		int b=Utility.inputInteger();
		int c=Utility.inputInteger();
		Utility.findroots(a,b,c);
	}
}
