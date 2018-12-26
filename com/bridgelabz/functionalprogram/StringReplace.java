package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;

public class StringReplace {

	public static void main(String[] args) {

		// Initializing variables
		String template = "Hello <<UserName>>, How are you?";

		System.out.print("Please enter your name: ");
		String userName = Utility.inputString();
		
		// Method declaration for replacing String
		String outputString = Utility.replaceString(userName, template);
		System.out.println(outputString);

	}

}
