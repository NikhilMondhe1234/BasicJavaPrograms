package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class MonthlyPayment {
	
		public static void main(String[] args) 
		{
			System.out.println("Enter the loan amount :");
			double principal=Utility.inputDouble();
			System.out.println("Enter the Number of years :");
			double numberOfYears=Utility.inputDouble();
			System.out.println("Enter the Interest rate :");
			double rateOfIntrest=Utility.inputDouble();
			double payment=Utility.calmonthlyPayment(principal,numberOfYears,rateOfIntrest);
			System.out.println("Monthly payment of "+payment+" you would have to make over "+numberOfYears+
					" years to pay off a "+principal+" loan amount at "+rateOfIntrest+" percent intrest compounded monthly");
		}

	}
