package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class VendingMachine {
	
	public static void main(String arg[]) {
		
		System.out.println("Enter the money you want to change");
		int money=Utility.inputInteger();
		Utility.giveMinimumChange(money);
	}
}