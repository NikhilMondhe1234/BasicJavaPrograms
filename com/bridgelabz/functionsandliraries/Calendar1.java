/**
 * purpose: Takes the date as input and prints the Day Of Week of the month. 
 * @author: Nikhil Mondhe
 * @version: 1.0
 * @since:  29/11/2018
 */
package com.bridgelabz.functionsandliraries;

import com.bridgelabz.utility.Utility;

	public class Calendar1 {

		public static void main(String[] args) {
			System.out.println("Enter the day");
			int day=Utility.inputInteger();
			System.out.println("Enter the month");
			int month=Utility.inputInteger();
			System.out.println("Enter the year");
			int year=Utility.inputInteger();
			String week[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
			int result=Utility.dayofWeek(day,month,year);
			System.out.println("The day  of week is :"+week[result]);
		}
}