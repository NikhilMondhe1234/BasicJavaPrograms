/**
 * @purpose : Reads all the method from bridgeLab Libaries and perform operation 
 * 			  Mean,Median, Max,Min,Standard Variance and Standard Deviation.
 * @author  : Nikhil Mondhe
 * @version : 1.0
 * @since   : 1/12/18
 */
package com.bridgelabz.functionsandliraries;

import com.bridgelabz.libraries.BLStats;
import com.bridgelabz.utility.Utility;

public class BLStat {
	public static void main(String arg[])
	{
		double array[]= {2.5,4.8,8.6,6.74,74.25,54.33,74.85};
		int invalidInput;
		do
		{
		System.out.println("1.Max Double\n"
						+  "2.Min Double\n"
						+  "3.Mean\n"
						+  "4.Standard Variance\n"
						+  "5.Standard Deviation\n");
		System.out.println("Enter your choice");
		int choice=Utility.inputInteger();
		switch(choice)
		{
		  case 1:
			  System.out.println("Max value : "+BLStats.max(array));
			  break;
		  case 2:
			  System.out.println("Min value : "+BLStats.min(array));
			  break;
		  case 3:
			  System.out.println("Mean value: "+BLStats.mean(array));
			  break;
		  case 4:
			  System.out.println("Standard Varaince : "+BLStats.var(array));
			  break;
		  case 5:
			  System.out.println("Standard Deviation: "+BLStats.stddev(array));
			  break;
		  default:
			  System.out.println("Invalid input");
		}
		System.out.println("You want to continue press 1 otherwise 0 ");
		invalidInput=Utility.inputInteger();
	}while(invalidInput==1);
	}
}
