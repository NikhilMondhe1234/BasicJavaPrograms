/**
 * purpose : Demostarte all random function  
 * @author : Nikhil Mondhe
 * @version: 1.0
 * @since  : 30/11/2018
 */
package com.bridgelabz.functionsandliraries;

import com.bridgelabz.libraries.BLRandom;
import com.bridgelabz.libraries.BLStdOut;
import com.bridgelabz.utility.Utility;

public class RandomFunction {

	public static void main(String[] args) {
		int invalidInput;
		System.out.println("Enter the n value");
		int n=Utility.inputInteger();
		do
		{
			System.out.println("1.Seed\n"
							 + "2.Uniform int \n"
							 + "3.uniform Double\n"
							 + "4.Bernoulli\n"
							 + "5.Gaussain Sigma\n"
							 + "6.Discrete\n"
							 + "7.Shuffle\n"
							 + "8.Exit\n");
			System.out.println("Enter your choice\n");
			int choice=Utility.inputInteger();
			switch(choice)
			{
				case 1:
					if (args.length == 2)
					{
						BLRandom.setSeed(Long.parseLong(args[1]));
					}
					BLStdOut.println("Seed :"+BLRandom.getSeed());
					break;
				case 2:
					for(int i=0;i<n;i++)
					{	
						BLStdOut.println(""+BLRandom.uniform(100));
					}
					break;
				case 3:
					for(int i=0;i<n;i++)
					{
						BLStdOut.println(""+BLRandom.uniform(10.0, 99.0));
					}
					break;
				case 4:
					for(int i=0;i<n;i++)
					{
						BLStdOut.println(""+BLRandom.bernoulli(0.5));
					}
					break;
				case 5:
					for(int i=0;i<n;i++)
					{
						BLStdOut.println(""+BLRandom.gaussian(9.0,0.2));
					}
					break;
				case 6:
					double[] probabilities = { 0.5, 0.3, 0.1, 0.1 };
					for(int i=0;i<n;i++)
					{
						BLStdOut.println(""+BLRandom.discrete(probabilities));
					}
				case 7:
					for(int i=0;i<n;i++)
					{
						double[] a = {2.1 ,5.8 ,7.2 ,5.5 ,7.5};
						BLRandom.shuffle(a);
			            	for (double s : a)
			            		System.out.print(s);
			            BLStdOut.println();
					}
					break;
				default:
					BLStdOut.println("Invalid Input");
			}
			BLStdOut.println("You want to continue press 1 and 0 to exit");
			invalidInput=Utility.inputInteger();
        }while(invalidInput==1);
	}
}