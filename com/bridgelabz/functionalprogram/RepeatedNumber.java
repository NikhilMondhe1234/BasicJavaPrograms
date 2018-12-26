/**
 * purpose: Find the repeated number by user provided array
 * @author: Nikhil Mondhe
 * @version: 1.0
 * @since:  28/11/2018
 */
package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;

public class RepeatedNumber {

	public static void main(String[] args) {
		System.out.println("Enter the size element you want in array");
		int size=Utility.inputInteger();
		int array[]= new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<array.length;i++)
		{
			array[i]=Utility.inputInteger();
		}
		Utility.repeatedNumber(array,size);
	}
}
