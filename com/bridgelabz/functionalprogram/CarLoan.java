package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;

public class CarLoan {
	
		public static void main(String[] args) 
		{
			double principal=Double.parseDouble(args[0]);
			double numberOfYears=Double.parseDouble(args[1]);
			double rateOfIntrest=Double.parseDouble(args[2]);
			
			double payment=Utility.calmonthlyPayment(principal,numberOfYears,rateOfIntrest);
			System.out.println("Car loan amount of "+payment+" you would have to make over "+numberOfYears+
					" years to pay off a "+principal+" loan amount at "+rateOfIntrest+" percent intrest compounded monthly");
		}
}