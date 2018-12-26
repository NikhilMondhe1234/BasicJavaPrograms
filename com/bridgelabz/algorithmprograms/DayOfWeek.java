/**
 * purpose: Calculates of the program show the day of week by using Gregorain calender
 * @author: Nikhil Mondhe
 * @version: 1.0
 * @since:  5/11/2018
 */
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

	public class DayOfWeek {

		public static void main(String[] args) {
			int day=Integer.parseInt(args[0]);
			int month=Integer.parseInt(args[1]);
			int year=Integer.parseInt(args[2]);
			String week[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
			int result=Utility.dayofWeek(day,month,year);
			System.out.println("The day  of week is :"+week[result]);
		}
	}
//input validation check for negative number 