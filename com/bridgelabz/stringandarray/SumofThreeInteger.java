package com.bridgelabz.stringandarray;

import com.bridgelabz.utility.Utility;

public class SumofThreeInteger {

		public static void main(String[] args)
		{
			System.out.println();

			//enter the array size
			System.out.print("Enter Size of Array :");
			int size=Utility.inputInteger();
			int arr[]=new int [size];	//create array & read values one by one

			for(int i=0;i<arr.length;i++)
			{
				System.out.print("Enter "+(i+1)+" Value :");
				arr[i]=Utility.inputInteger();
			}

			int sum=Utility.findDistinctTriplets(arr,size);
			System.out.println("No.of Tripltes :"+sum);
			System.out.println();
		}
	}