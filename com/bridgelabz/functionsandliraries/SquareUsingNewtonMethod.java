/**
 * purpose : find the square root number using Newton method
 * @author : Nikhil Mondhe
 * @version: 1.0
 * @since  : 30/11/2018
 */
package com.bridgelabz.functionsandliraries;

import com.bridgelabz.libraries.MathFunction;
import com.bridgelabz.utility.Utility;

public class SquareUsingNewtonMethod {

	public static void main(String[] args) {
		System.out.println("enter a non negative number");
		int c=Utility.inputInteger();
		double answer=MathFunction.sqrt(c);
		System.out.println("Square root of "+c+" by Newtons method is ="+answer);
	}

}
