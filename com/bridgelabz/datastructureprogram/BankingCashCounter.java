package com.bridgelabz.datastructureprogram;

import com.bridgelabz.utility.Utility;

public class BankingCashCounter {

	public static void main(String[] args) {
		//called Myqueue Gereric class 
		MyQueue<Integer> myQueue = new MyQueue<Integer>();
		//Take user input as a Integer inital amount
		System.out.println("Enter the intial amount in the bank");
		Integer intialAmount=Utility.inputInteger();
		//Take user input how many people in the queue
		System.out.println("How many people in a queue");
		Integer numberofPerson = Utility.inputInteger();
		Integer depositamount;
		Integer withdrawAmount;
		for(int i=0;i<numberofPerson;i++)
		{
			//Add the element in the Queue
			myQueue.enqueue(i);
		}
		while(myQueue.size()!=0)
		{
			System.out.println("Select a option");
			System.out.println("Enter 0 to deposit");
			System.out.println("Enter 1 to withdraw");
			int option=Utility.inputInteger();
			switch(option)
			{
			case 0:
				System.out.println("Enter how much amount you want to deposit");
				depositamount=Utility.inputInteger();
				intialAmount=intialAmount+depositamount;
				System.out.println("Update balance is "+intialAmount);
				//remove in the Queue
				myQueue.dequeue();
				break;
			case 1:
				System.out.println("Enter hoe much money you want to withdraw");
				withdrawAmount=Utility.inputInteger();
				if(withdrawAmount>intialAmount)
				{
					System.out.println("Sorry insufficiet balance");
					System.out.println("If you want to withdraw money less than "+intialAmount);
					System.out.println("If yes then press 1 otherwise press 0");
					if(Utility.inputInteger()==1)
					{
						continue;
					}
					//remove in the queue
					myQueue.dequeue();
				}
				else
				{
					intialAmount=intialAmount+withdrawAmount;
					System.out.println("The updated balance is:"+intialAmount);
					//remove in the queue
					myQueue.dequeue();
				}
				break;
			default:
					System.out.println("Invaild option");
			}
		}
	}
}
