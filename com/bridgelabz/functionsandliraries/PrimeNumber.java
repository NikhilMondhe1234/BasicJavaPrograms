/**
 * purpose : Check the prime number 
 * @author : Nikhil Mondhe
 * @version: 1.0
 * @since  : 30/11/2018
 */
package com.bridgelabz.functionsandliraries;

import com.bridgelabz.libraries.MathFunction;
import com.bridgelabz.utility.Utility;

public class PrimeNumber {
	public static void main(String arg[])
	{
		System.out.println("Enter the number you want to check");
		int value=Utility.inputInteger();
		boolean primeNumber=MathFunction.isPrime(value);
		System.out.println(primeNumber);
	}

}
