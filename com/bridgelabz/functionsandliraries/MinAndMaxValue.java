package com.bridgelabz.functionsandliraries;

import com.bridgelabz.libraries.MathFunction;
import com.bridgelabz.utility.Utility;

public class MinAndMaxValue {

	public static void main(String[] args) {
		System.out.println("Enter the size element you want in array");
		int size=Utility.inputInteger();
		int array[]= new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<array.length;i++)
		{
			array[i]=Utility.inputInteger();
		}
		int maxValue = MathFunction.getMaxValue(array);
		System.out.println("The Maxmimum Integer value is:"+maxValue);
		int minValue = MathFunction.getMinValue(array);
		System.out.println("The Minumum Integer value is :"+minValue);
	}

}
