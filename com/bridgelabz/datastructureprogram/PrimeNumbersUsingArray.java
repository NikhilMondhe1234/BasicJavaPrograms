package com.bridgelabz.datastructureprogram;

import com.bridgelabz.utility.Utility;

public class PrimeNumbersUsingArray {
	public static void main(String[] args) 
	{
		int m=0;
		int n=100;
		String[][] array=new String[10][30];
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<30;j++)
			{
				array[i][j]=" ";
			}
		}
		int columnIndex=0;
		for(int rowIndex=0;rowIndex<10;rowIndex++)
		{
			for(int i=m;i<=n;i++)
			{
				if(Utility.findprimenumber(i))
				{
					array[rowIndex][columnIndex++]=i+"";
				}				
			}
			if(m<=900 && n<=1000)
			{
				m=m+100;
				n=n+100;
				columnIndex=0;
			}
		}
		Utility.print2DArrayElement(array);
	}
}