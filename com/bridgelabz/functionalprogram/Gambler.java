/**
 * purpose: A gambler starts with certain stake in INR and places fair Re 1 bet 
 * 			until he/she goes broke or reaches the goal set as input. 
 * 			Keeps track of the number of times won and number of bets made.
 * @author: Nikhil mondhe
 * @version:1.0
 * @since:  5/11/2018
 */
package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;

public class Gambler 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the stake :");
		int stake=Utility.inputInteger();
		System.out.println("Enter the goal 	:");
		int goal=Utility.inputInteger();
		System.out.println("Enter the chance:");
		int chance=Utility.inputInteger();
		Utility.calWinLossInGambling(stake,goal,chance);
	}
}