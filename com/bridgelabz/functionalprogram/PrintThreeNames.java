/**
 * purpose : Read the three input string and print them in proper statments
 * @author : Nikhil Mondhe
 * @version: 1.0
 * @since  : 26/11/2018
 */
package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;

public class PrintThreeNames {
	public static void main(String arg[])
	{
		String s,rev="Hi ";
		System.out.println("Enter the names");
		s=Utility.inputString();
		String arr[]= s.split(" ");
		int length=arr.length;
		for(int i=length-1;i>=0;i--)
		{
			rev = rev + arr[i] + " ";
		}
		System.out.println(rev);
	}
}
