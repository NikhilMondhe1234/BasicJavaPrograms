package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class TemperatureConversion {

	public static void main(String[] args) {
		double fahrenheit;
		double Celsius;
		System.out.println("Enter your choice");
		System.out.println("1.Convert the Temperature in Fahrenheit to Celsius\n"
						 + "2.Convert the Temperature in Celsius to Fajrenheit");
		int input=Utility.inputInteger();
		switch(input)
		{
		case 1:
			System.out.println("Enter the temperature in Fahrenheit:");
			fahrenheit=Utility.inputDouble();
			double result=Utility.temperatureinCelsius(fahrenheit);
			System.out.println("The temperature in Celsius :"+result);
			break;
		case 2:
			System.out.println("Enter the  temperature in Celsius:");
			Celsius=Utility.inputDouble();
			double result1=Utility.temperatureinFahrenheit(Celsius);
			System.out.println("The temperature in Farenheit"+result1);
			break;
			
		default:
			System.out.println("Invaild input");
		}
	}
}
