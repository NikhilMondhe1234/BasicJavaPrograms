package com.bridgelabz.datastructureprogram;

import com.bridgelabz.utility.Utility;

public class PalindromeChecker {

	public static void main(String[] args) 
	{
		//called the dequeutilty class we created 
		DequeUtility<Character> dequeUtility=new DequeUtility<Character>();
		//Take the user input as a string
		System.out.println("Enter a String:");
		String string=Utility.inputString();

		for(int i=0;i<string.length();i++)
		{
			char c =string.charAt(i);
			//adding each character to the rear of the deque
			dequeUtility.addRear(c);
		}
		int flag=0;

		while(dequeUtility.size()>1)//Check the size of the deque greater than 1
		{
			if(dequeUtility.removeFront()!=dequeUtility.removeRear())
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
}