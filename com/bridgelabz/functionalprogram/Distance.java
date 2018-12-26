package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;

public class Distance { 
	public static void main(String arg[]) {
		System.out.println("Enter the value quadrant");
		int x=Utility.inputInteger();
		int y=Utility.inputInteger();//change the program Two input using command line
		double result=Utility.finddistance(x,y);
		System.out.println("The Distance is :"+result);		
	}
}
