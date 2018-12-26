/**
 * purpose : That prints five uniform random values between 0 and 1,
 *			 their average value, and their minimum and maximum value.
 * @author : Nikhil Mondhe
 * @version: 1.0
 * @since  : 28/11/2018
 */
package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;

public class Stats5 {

	public static void main(String[] args) {
		double output = Utility.statsRandom();
		System.out.println("The average is :"+ output);
	}
}
