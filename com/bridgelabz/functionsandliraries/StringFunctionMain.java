/**
 * purpose: Perform the various string fucntion Anagram check,Palindrome,string permutaion using 
 * 			iterative and recursion method.
 * @author: Nikhil Mondhe
 * @version: 1.0
 * @since:  29/11/2018
 */
package com.bridgelabz.functionsandliraries;

import com.bridgelabz.libraries.StringFunction;
import com.bridgelabz.utility.Utility;

public class StringFunctionMain {
	public static void main(String[] args) {
		String string1;
        String string2;
        int invalidInput;
        do
        {
        System.out.println("1.Check Anagram\n"
        				 + "2.Check String is Palindrome or Not\n"
        				 + "3.String permutation Recursion method\n"
        				 + "4.String permutation Iterative method");
        System.out.println("Enter your choice");
        int ch=Utility.inputInteger();	
        		switch(ch)
        		{
	        		case 1:
	        			System.out.print("Enter First String : \n");
	        			string1 = Utility.inputString1();//white space
	        			System.out.print("Enter Second String : \n");
	        			string2 = Utility.inputString1();
	        			StringFunction.checkAnagram(string1, string2);
	        			break;
	        		case 2:
	        			System.out.println("Enter the string you want check");
	        			String inputString = Utility.inputString1();
	        			if(StringFunction.isPalindrome(inputString))
	        			{
	        				System.out.println("Yes");
	        			}
	        			else
	        			System.out.println("No");
	        			break;
	        		case 3:
	        			System.out.println("Enter the string to generate permutation");
	        			String inputString1 = Utility.inputString1();
	        			StringFunction.permutation(inputString1);
	        			break;
	        		case 4:
	        			System.out.println("Enter the string to generate permutation");
	        			String inputString2=Utility.inputString1();
	        			StringFunction.permutationIterative(inputString2,inputString2.length());
	        			break;
	        		default: 
        			System.out.println("Invalid input");
        		}
        		System.out.println("You want to continue press 1 and 0 to exit");
        		invalidInput=Utility.inputInteger();
        	}while(invalidInput==1);
	}
}

