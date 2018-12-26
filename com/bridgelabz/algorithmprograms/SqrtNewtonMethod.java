/**
 * purpose: evaluates square root of a given number using newtons method.
 * 
 * @author:Nikhil Mondhe
 * @since:29/11/2018
 * @version:1.0
 */
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class SqrtNewtonMethod
{

	public static void main(String[] args) throws NonPositiveNumberException
	{
		
		System.out.println("enter a non negative number");
		int c=Utility.inputInteger();
		if(c<0)
		{
			String exceptionMessege="A positive number was needed, not a negative number";
			throw new NonPositiveNumberException(exceptionMessege);
		}
		else
		{
			double answer=Utility.sqrt(c);
			System.out.println("Square root of "+c+" by Newtons method is ="+answer);
		}
	}
}
