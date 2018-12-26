package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;

public class CouponNumber {

		public static void main(String[] args) 
		{
			System.out.println("How Many coupon do you want to generate:");
			int num=Utility.inputInteger();
			Utility.couponDisplay(Utility.couponGenerator(num));			
		}
}