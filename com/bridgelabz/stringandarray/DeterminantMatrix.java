package com.bridgelabz.stringandarray;

import com.bridgelabz.utility.Utility;

public class DeterminantMatrix {

	public static void main(String[] args) {
		System.out.println("Enter the rows of array");
		int rows=Utility.inputInteger();
		System.out.println("Enter the columns of array");
		int columns=Utility.inputInteger();
		int array[][]=new int[rows][columns];
		System.out.println("Enter the Elements in an array");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				array[i][j]=Utility.inputInteger();
			}
		} 
		System.out.println("operation Start to find the determinent");
	}
	public static void cofactor(int temp[][],int mat[][],int p,int q,int n){
		for(int row=0;row<n;row++)
		{
			for(int col=0;col<n;col++)
			{
				if(row !=p && col !=q)  
				{
					int i=0;int j=0;
					temp[i][j++]=mat[row][col];
					if(j==n-1)
					{
						j=0;
						i++;
					}
				}
			}
		}
	}
	public static int determinantMatrix(int temp[][])
	{
		 
		return 0;
	}
}
