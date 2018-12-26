/**
 * purpose: Convert Decimal to Binary and Binary to decimal.
 * @author: Nikhil Mondhe
 * @version: 1.0
 * @since:  15/11/2018
 */
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

	public class Binary {
		
		public static void main(String arg[]) {
			String swapedBinary;
			//Initlizing varblies
			//Take a command line argument
			int decimal=Integer.parseInt(arg[0]);
			
			//Convert decimal to binary
			
			String binary=Utility.decimalToBinary(decimal);
			System.out.println("binary :"+binary);
			
			//Swapped two nibbles
			
			swapedBinary=binary.substring(4, 8)+binary.substring(0,4);
			System.out.println("swapedBinary :"+swapedBinary);
			
			//Convert binary to decimal
			
			int swapedDecimal=Utility.binaryToDecimal(swapedBinary);
			System.out.println("Decimal value after swapping :"+decimal+" is "+swapedDecimal);
			for(int i=1;i<Math.sqrt(swapedDecimal);i++)
			{
				if(swapedDecimal%Math.pow(2, i)==0)
				{
					System.out.println("The swaped decimal number :"+swapedDecimal+
							" is divisble by "+i+"th power of 2");
					return;
				}
			}
			System.out.println("the swaped decimal number "+swapedDecimal+
					" is divisble by any power of 2");
		}
	}
