package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;

public class PrintInitials {
		public static void main(String []args)
	    {
			char ch = 0;
			System.out.println("Enter the input");
			String name=Utility.inputString();
			for(int i=0;i<name.length();i++)
			{
				ch=name.charAt(0);
			}
			switch(ch)
			{
				case 'K':
						patternAlphabetK();
						break;
				case 'W':
						patternAlphabetW();
						break;
				case 'D':
						patternAlphabetD();
						break;
				default:
					System.out.println("Invalid input");
		}
			
	}
	/**
	 * This method is used to print the aplhabet "K" in star pattern 
	 */
	public static void patternAlphabetK()
	{
		int i,j,k,count=6;
		for(i=0;i<=11;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.printf("*");
			}
			for(k=0;k<=6;k++)
			{
				if(k==count)
				{
					System.out.printf("***");
				}
				else
				{
					System.out.printf("  ");
				}
			}
			if(i<=5)
			{
				count--;
			}
			else if(i<=11)
			{
				count++;
			}
		System.out.printf("\n");
	}
}
	/**
	 * This method is used to print the aplhabet "W" in star pattern 
	 */
	public static void patternAlphabetW()
	{
		int i,j,k;
		for(i=0;i<=11;i++)
		{	
			//Print the space first 
			for(j=0;j<=i;j++)
			{
				System.out.printf(" ");
			}
			//Print the first line of W
			for(int l=0;l<2;l++)
			{
				System.out.printf("*");
			}
			//print the Two spaces of W
			for(k=10;k>=i;k--)
			{
				System.out.printf("  ");
			}
			//Print the second line of W
			for(int l=0;l<2;l++)
			{
				System.out.printf("*");
			}
			
			
			//Second Portion Of Character W
			for(j=1;j<=i;j++)
			{
				System.out.printf("  ");
			}
			for(int l=0;l<2;l++)
			{
				System.out.printf("*");
			}
			for(k=10;k>=i;k--)
			{
				System.out.printf("  ");
			}
			for(int l=0;l<2;l++)
			{
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
	/**
	 * This method is used to print the aplhabet "D" in star pattern 
	 */
	public static void patternAlphabetD()
	{
		int i,j;
		for(i=1;i<=11;i++)
		{
			for(j=1;j<=2;j++)
			{
				System.out.printf("*");
			}
			if(i==1||i==11)
			{
				System.out.printf("**********");
			}
			else if(i==10||i==2)
			{
				System.out.printf("           **");
			}
			else if(i==9||i==3)
			{
				System.out.printf("            **");
			}
			else if(i==8||i==4)
			{
				System.out.printf("             **");
			}
			else if(i==7||i==6||i==5)
			{
				System.out.printf("              **");
			}
			System.out.println();
		}
	}
}
