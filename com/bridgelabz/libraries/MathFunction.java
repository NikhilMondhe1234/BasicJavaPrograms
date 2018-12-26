/**
 *  purpose: Declare the all Math Function in one class to create a libaray.
 *
 *  @author  Nikhil Mondhe
 *  @version 1.0
 *  @since   29-11-2018
 *
 */
package com.bridgelabz.libraries;

public class MathFunction {
	
	/**
	 * Function is used to find the Harmonic number input 
	 * 
	 * @param n number upto which harmonic number should be calculated
	 * @return double which is the n'th harmonic number
	 */
	 public static double printHarmonic(int n) {         //function to print Nth harmonic number, i.e 1/1 + 1/2 + .... + 1/N
		
		double nthHarmonicNumber = 0;
		if (n < 0) {
			System.out.println("invalid number");

		} else {
			for (double i = 1; i <= n; i++)// for floating point operations atleast one operand should be double or
				// float
			{
				// System.out.println(1/i);
				nthHarmonicNumber += 1 / i;
			}
			
		}
		return nthHarmonicNumber;
	}
	 /**
	  * Function is used to convert decimal to binary
	  * 
	  * @param decimal the decimal number which is converted into binary
	  * @return the binary number which is type of string
	  */
	 public static String decimalToBinary(int decimal) 
	 {
		String binaryNumberInString="";
		String temporary="";
		int number=decimal;
		while(number>=1)
		{
			binaryNumberInString=binaryNumberInString+number%2;
			number=number/2;
		}
		if(binaryNumberInString.length()>0 && binaryNumberInString.length()<32)
		{
			binaryNumberInString+=giveZero(32-binaryNumberInString.length());
		}
		for(int i=binaryNumberInString.length()-1;i>=0;i--)
		{
			temporary+=binaryNumberInString.charAt(i);
		}
		binaryNumberInString=temporary;
		return binaryNumberInString;
	}
		
	/**
	* @param numberofzeroRequired the number of zero the user needs
	* @return the string value 
	*/
	public static String giveZero(int numberofzeroRequired) {
		String s ="";
		for(int i=0;i<numberofzeroRequired;i++)
		{
			s=s+0;
		}
		return s;
	}
	/**
	 * Function is used to find the square root using Newton Method 
	 * 
	 * @param c the number whose square root value will be calculated by using newtons method
	 * @return returns the square root value of the given number
	 */
	public static double sqrt(int c) 
	{
		 double t=c;
         double epsilon=1e-15;
         while(Math.abs(t-c/t) > epsilon*t)
         {
             t = (c/t + t)/2;
         }
         return t;
		
	}
	/**
	 * This function is used to find prime numbers between 0 to 1000
	 * 
	 * @param number which number you want to check
	 * @return result prime number is true
	 */
	public static boolean isPrime(int number) {

		for(int j=2;j<=number/2;j++)
		{
			int rem =number%j;
			if(rem==0)
			{
				return false;
			}
		}
		return true;
	}
	/**
	 * Function is used to calculate the factorial
	 * 
	 * @param number integer provided by the user
	 * @return factorial value of number
	 */
	public static int factorial(int number)
	{
		int fact=1;
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	/**
	 * Function is used to calculate the futervalue of investment
	 * 
	 * @param investment how much money you invest
	 * @param rateOfInterest interest rate of per month
	 * @param year how much period you want to invest
	 * @return future value of investment after that period
	 */
	public static double futureValue(double investment,double rateOfInterest ,double year)
	{
		rateOfInterest=(1+rateOfInterest);
		double value=investment*Math.pow(rateOfInterest, year);
		return value;
	}
	/**
	 * Function is used to calculate the present value of investment
	 * 
	 * @param investment how much money you invest
	 * @param rateOfInterest interest rate of per month
	 * @param year how much period you want to invest
	 * @return present value of investment after that period
	 */
	public static double presentValue(double investment,double rateOfInterest ,double year)
	{
		rateOfInterest=(1+rateOfInterest);
		double value=investment/Math.pow(rateOfInterest, year);
		return value;
	}
	/**
	 * Function is used to find the min Integer value in an array
	 * 
	 * @param numbers integer array provided by the user
	 * @return the result minValue of Integer
	 */
	public static int getMinValue(int[] numbers)
	{
		int minValue = numbers[0];
		for(int i=1;i<numbers.length;i++)
		{
		    if(numbers[i] < minValue)
		    {							//change the logic repeated twice
			  minValue = numbers[i];
			}
		 }
		 return minValue;
	}
	/**
	 * Function is used to find the max Integer value in an array
	 * 
	 * @param numbers integer array provided by the user
	 * @return the result maxValue of Integer
	 */
	public static int getMaxValue(int[] numbers)
	{
		int maxValue = numbers[0];
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]> maxValue)
			{
				maxValue = numbers[i];
			}
		}
		return maxValue;
	}
	/**
	 * Function is used to find the radains of degree
	 * @param degree provide by the user
	 * @return radians value
	 */
	public static double radians(double degree)
	{
		double  PI=3.14159;
		double  radians = degree*PI/180;
		return radians;
	}
	/**
	 * Function is used to find the sin value of a angle
	 * 
	 * @param degree double provided by the user
	 * @return result get the sin value of enter angle
	 */
	public static double sinAngle(double degree)
	{
		double sin=Math.sin(MathFunction.radians(degree));
		return sin;
	}
	/**
	 * Function is used to find the cos value of a angle
	 * 
	 * @param degree double provided by the user
	 * @return result get the cos value of enter angle
	 */
	public static double cosAngle(double degree)
	{
		double cos=Math.cos(MathFunction.radians(degree));
		return cos;
	}
	/**
	 * Function is used to check the points are collinear or not using slope
	 * 
	 * @param x1 first point
	 * @param x2 second point
	 * @param y1 third point
	 * @param y2 fourth point
	 * @param x3 fifth point
	 * @param y3 sixth point
	 * @return false if not collinear to each other
	 */
	public static boolean checkCollinearUsingSlope(int x1,int x2,int y1,int y2,int x3,int y3)
	{
		
		int a = (y2-y1)/(x2-x1);
		int b = (y3-y2)/(x3-x2);
		int c = (y3-y1)/(x3-x1);
		if(a==b && b==c && a==c)
		{
			return true;
		}
		return false;
	}
	/**
	 * Function is used to check the points are collinear or notusing area
	 *  
	 * @param x1 first point
	 * @param x2 second point
	 * @param y1 third point
	 * @param y2 fourth point
	 * @param x3 fifth point
	 * @param y3 sixth point
	 * @return false if not collinear to each other
	 */
	public static boolean checkCollinearUsingArea(int x1,int x2,int y1,int y2,int x3,int y3)
	{
		int a = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
		if(a==0)
		{
			return true;
		}
		return false;
	}
}
