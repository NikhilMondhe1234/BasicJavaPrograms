/**
 * purpose : Generate the factorial of number. 
 * @author : Nikhil Mondhe
 * @version: 1.0
 * @since  : 30/11/2018
 */
package com.bridgelabz.functionsandliraries;

import com.bridgelabz.libraries.MathFunction;
import com.bridgelabz.utility.Utility;

public class Factorial {
	public static void main(String args[])
	{
		System.out.println("Enter the number ");
		int factorial=Utility.inputInteger();
		int result=MathFunction.factorial(factorial);
		System.out.println("The factorial is :"+result);
	}

}
