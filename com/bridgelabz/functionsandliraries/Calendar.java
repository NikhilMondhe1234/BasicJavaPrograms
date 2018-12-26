/**
 * purpose: That takes the month and year as command­line arguments and prints the Calendar of the month. 
 * @author: Nikhil Mondhe
 * @version: 1.0
 * @since:  20/11/2018
 */
package com.bridgelabz.functionsandliraries;

import com.bridgelabz.utility.Utility;

public class Calendar {
	public static void main(String[] args) 
	{
		int date=1;
		//Take a two command line argument Month and Year
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		String[] daysArray= {"S   ","M   ","T   ","W   ","TH  ","F   ","S   "};
		String[] months= {" ","Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sept","Oct","Nov","Dec"};
		Integer[] daysInMonths= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		//Check if the year is leap year
		if(Utility.checkLeapYear(year).equals("Leap Year"))
		{
			daysInMonths[2]=29;
		}
		String[][] calender=new String[6][7];
		for(int i=0;i<calender.length;i++)
		{
			for(int j=0;j<calender[i].length;j++)
			{
				calender[i][j]=" ";
			}
		}
		//Method is used to valid date is provided by the user
		if(Utility.isValidDate(date, month, year)==true)
		{
			int day=Utility.dayofWeek(date, month, year);
			int tillDate=daysInMonths[month];
			System.out.println("   "+months[month]+" "+year);
			for(int i=0;i<daysArray.length;i++)
			{
				System.out.print(daysArray[i]);
			}
			System.out.println();
			System.out.println();
			int count=1;
			int j=0;
			for(int i=0;i<calender.length;i++)
			{
				if(i==0 )
				{
					for(int k=0;k<day;k++)
					{
						calender[i][j]="   ";
						j++;
					}
				}
				for(j=day;j<calender[i].length;j++)
				{	
					
					if(count<=tillDate)
					{
						if(count<=9)
						{
							calender[i][j]=count+"  ";
							count++;
						}
						else
						{
							calender[i][j]=count+" ";
							count++;
						}
					}
				}
				day=0;
			}
			//Display the calender in 2DArray
			Utility.print2DArrayElement(calender);
		}
		else
		{
			System.out.println("Invalid month or year given");
			return;
		}
	}
}