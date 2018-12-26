/**
 * purpose: Perform the various Math fucntion Harmonic Number,Sin of angle,cos of angle ,Binary number, 
 * 			Square root etc.
 * @author: Nikhil Mondhe
 * @version: 1.0
 * @since:  29/11/2018
 */
package com.bridgelabz.functionsandliraries;

import com.bridgelabz.libraries.MathFunction;
import com.bridgelabz.utility.Utility;

public class MathFunctionMain {
	public static void main(String args[])
	{
		double angle;
		int invalidInput;
		do
		{
		System.out.println("1.Harmonic Number\n"
						 + "2.Sin of Angle\n"
						 + "3.Cosine of Angle\n"
						 + "4.Binary Number\n"
						 + "5.Exit\n");
		System.out.println("Enter your choice");
		int choice=Utility.inputInteger();
		switch(choice)
		{
			case 1:
				System.out.println("Enter a number");
				int n = Utility.inputInteger();
				if(n<=0)
				{
					System.out.println("Invalid Input");
				}
				else
				{
					MathFunction.printHarmonic(n);
					System.out.println("the " + n + "th" + " harmonic number is " + MathFunction.printHarmonic(n));
				}
				break;
			case 2:
				System.out.println("Enter the angle");
				angle = Utility.inputDouble();
				double sin=MathFunction.sinAngle(angle);
				System.out.println("The sine of "+angle+" "+sin);
				break;
			case 3:
				System.out.println("Enter the angle (in degree)");
				angle = Utility.inputDouble();
				double cos=MathFunction.cosAngle(angle);
				System.out.println("The cos of "+angle+" "+cos);
				break;
			case 4:
				System.out.println("Enter the number you want to convert decimal to binary ");
				int decimal = Utility.inputInteger();
				String binary= MathFunction.decimalToBinary(decimal);
				System.out.println("The binary value of " + decimal + " is :"+binary);
				break;
			default: 
    			System.out.println("Invalid input");
    	}
    		System.out.println("You want to continue press 1 and 0 to exit");
    		invalidInput=Utility.inputInteger();
    	}while(invalidInput==1);
	}
}
