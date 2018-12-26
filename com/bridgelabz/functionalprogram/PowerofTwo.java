/**
 *  purpose: Prints a table of the power of 2.it prints upto the nth power
 *
 *  @author  Nikhil Mondhe
 *  @version 1.0
 *  @since   29-10-2018
 */

package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;

public class PowerofTwo 
{

	public static void main(String[] args)
	{
		int number=Integer.parseInt(args[0]);
		if(number<=0)
		{
			System.out.println("Invalid input");
		}
		else
		{
			Utility.printPowOf2(number);
		}
	}
}
