package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;

public class StopWatch {

	public static void main(String[] args) {
		long startTime=0;
		long stopTime=0;
		System.out.println("enter 1 to start the stopwatch");
		int input=Utility.inputInteger();
		int flag=0;
		while(flag==0)
		{
			switch(input)
			{
			case 1:
				startTime=System.nanoTime();
				System.out.println("enter 0 to stop the stopwatch");
				input=Utility.inputInteger();
				break;
			case 0:
				stopTime=System.nanoTime();
				flag=1;
				break;
			default:
				System.out.println("enter a valid option");
			}
		}
		double elapsedTime=(stopTime-startTime)/Math.pow(10, 9);
		System.out.println("startTime= "+startTime);
		System.out.println("stopTime= "+stopTime);
		if(startTime!=0)
		{
			System.out.println("elapsedTime= "+elapsedTime+" seconds");
		}
		else
			System.out.println("To start the stopwatch you should have pressed 0 only");
	}

}