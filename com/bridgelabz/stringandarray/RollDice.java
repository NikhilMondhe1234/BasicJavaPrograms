package com.bridgelabz.stringandarray;

import com.bridgelabz.utility.Utility;

public class RollDice {
	
public static void main(String[] args) {
	
	System.out.println("enter how many time u want to roll dice");
	int number=Utility.inputInteger();
	checkMaxRept(number);
	
}
	public static void checkMaxRept(int n)
	{
		int element = 0 ;
		int count = 0 ;
		int outCome[] = new int[n];
		for(int i = 0; i < n ;i++ )
		{
			outCome[i]=(int)(Math.random()*6+1);
		}
		for(int i = 0; i < n ;i++ )
		{
			System.out.println(outCome[i]);
		}
		for(int i = 0; i < outCome.length ; i++)
		{
			int tempElement = outCome [i];
			int tempCount = 0;
			for(int p=0; p < outCome.length; p++ )
			{
				if(tempElement == outCome[p])
				{
					tempCount++;
				}
			}
			if(count < tempCount)
			{
				element = tempElement ;
				count = tempCount ;
			}
		}
			System.out.println("Maximum time repeated number : "+element);
	}
}