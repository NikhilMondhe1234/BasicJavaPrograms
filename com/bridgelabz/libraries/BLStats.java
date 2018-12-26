/**
 * purpose : Takes array of real numbers from standard input, and computes 
 * 			 the minimum,mean,medium standard devaition.
 * @author : Nikhil Mondhe
 * @version: 1.0
 * @since  : 1/12/2018
 */
package com.bridgelabz.libraries;

public class BLStats {
	/**
	 * Function	find the max of double array
	 * 
	 * @param numbers read the double array
	 * @return the largestvalue of an array
	 */
	public static double max(double[] a)
	{
		double largestValue = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]> largestValue)
			{
				largestValue = a[i];
			}
		}
		return largestValue;
	}
	/**
	 * Function is used to find min value of a array
	 * 
	 * @param a reads the array provided by the user
	 * @return the smallestvalue of an array
	 */
	public static double min(double[] a)
	{
		double smallestValue = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<smallestValue)
			{
				smallestValue = a[i];
			}
		}
		return smallestValue;
	}
	/**
	 * Function is used to sum of array element 
	 * 
	 * @param a reads the array provided by the user
	 * @return the sum of given array
	 */
	public static double sum(double[] a)
	{
		double sum=0.0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}
	/**
	 * Function is used find the average of a given array
	 * 
	 * @param a reads the array provided by the user
	 * @return the mean value of a array
	 */
	public static double mean(double[] a)
	{
		if(a.length==0)
		{
			System.out.println("invalid");
		}
		double sum=sum(a);
		return 1.0 * sum /a.length;
	}
	/**
	 * Function is used find the standard variance of a mean
	 * 
	 * @param a reads the array provided by the user
	 * @return the Standarad varaince of a array
	 */
	public static double var(double[] a)
	{
		if(a.length == 0)
		{
			System.out.println("Invalid");
		}
		double avg = mean(a);
		double sum = 0.0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum +(a[i]-avg ) * (a[i] - avg);
		}
		return sum/(a.length-1);
	} 
	/**
     * Returns the sample standard deviation in the specified array.
     *
     * @param  a the array
     * @return the sample standard deviation in the array a[];
     *         if no such value
     */
    public static double stddev(double[] a) {

       return Math.sqrt(var(a));
}	
    public void plotLines()
    {
    	
    }
}