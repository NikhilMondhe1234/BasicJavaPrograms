/**
 * purpose: Takes a range of number as input and outputs the Prime Numbers in that range.
 * @author: Nikhil
 * @version:1.0
 * @since:  10/11/2018
 */
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class PrimeNumbers {

	public static void main(String[] args) {
		//int n=Utility.inputInteger();
		for(int i=2;i<1000;i++)
		{
			if(Utility.findprimenumber(i));//method change
			{
				System.out.println(i);
			}
		}
	}
}//check the program logic
