package com.bridgelabz.stringandarray;

import com.bridgelabz.utility.Utility;

public class InsertionSort {
		
		public static void main(String[] args)
		{
			System.out.println("enter how many strings you want to store");
			int size=Integer.parseInt(Utility.inputString1());
			String[] array=new String[size];
			System.out.println("enter one by one string");
			for(int i=0;i<size;i++)
			{
				array[i]=Utility.inputString1();
			}
			array=Utility.insertionSortWords(array);
			System.out.println("the order of array elements after sorting is");
			for(int i=0;i<size;i++)
			{
				System.out.println(array[i]+" ");
			}
		}
}

