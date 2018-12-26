package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		
		
		double temperature=Double.parseDouble(args[0]);
		double windspeed=Double.parseDouble(args[1]);
		if(temperature< 50 && windspeed > 3 && windspeed <120)
		{
			double result=Utility.findwindchill(temperature,windspeed);
			System.out.println("Wind chill is:"+result);
		}
		else
		{
			System.out.println("Invalid input");
		}
	}
}
