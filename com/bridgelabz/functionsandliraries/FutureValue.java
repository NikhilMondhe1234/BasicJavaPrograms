/**
 * purpose : Find the FutureValue of investment 
 * @author : Nikhil Mondhe
 * @version: 1.0
 * @since  : 30/11/2018
 */
package com.bridgelabz.functionsandliraries;

import com.bridgelabz.libraries.MathFunction;
import com.bridgelabz.utility.Utility;

public class FutureValue {

	public static void main(String[] args) {
		System.out.println("Enter the investment");
		double investment=Utility.inputDouble();
		System.out.println("Enter the rate of interest");
		double rateOfInterest=Utility.inputDouble();
		System.out.println("Enter the year of period");
		double year=Utility.inputDouble();
		double futureValue=MathFunction.futureValue(investment, rateOfInterest, year);
		System.out.println("The future value is :"+futureValue);

	}

}
