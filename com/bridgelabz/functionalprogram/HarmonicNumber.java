/**
 *  purpose: Prints the nth harmonic number.
 *
 *  @author  Nikhil Mondhe
 *  @version 1.0
 *  @since   3-11-2018
 *
 */
package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) 
	{
		int n = Integer.parseInt(args[0]);
		Utility.printNthHarmonic(n);
		System.out.println("the " + n + "th" + " harmonic number is " + Utility.printNthHarmonic(n));
	}
}
