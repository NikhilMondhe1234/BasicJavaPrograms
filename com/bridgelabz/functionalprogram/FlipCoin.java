/**
 * purpose: Calculates percentage of head and tail after flipping a coin n number of times.
 * @author: Nikhil
 * @version: 1.0
 * @since:  1/11/2018
 */
package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;

public class FlipCoin 
{
	public static void main(String[] args) 
	{
		System.out.println("enter how many times the coin should be flipped");
		int numberOfTimes = Utility.inputInteger();
		Utility.percentOfHeadTail(numberOfTimes);
	}
}
//input validation