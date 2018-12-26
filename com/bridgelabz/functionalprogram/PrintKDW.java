package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;


public class PrintKDW 
{			
		public static void main(String[] args) 
		{
				// TODO Auto-generated method stub	
				System.out.println("Enter the names :");
				String names = Utility.inputString();
				String word[] = null;
				//System.out.println("Array elements: ");
				for(int i = 0;i<names.length();i++)
				{
					 word = names.split("\\s+");	
				}
				for(int i=0;i<word.length;i++)
				{
					if(word[i].charAt(0)=='k')
					{
						Utility.showLines("/home/adminstrato/Nikhil/pattern.txt", 1,9);
						System.out.println();
						
					}
					else if(word[i].charAt(0)=='d')
					{
						Utility.showLines("/home/adminstrato/Nikhil/pattern.txt", 11,20);	
						System.out.println();
					}
					else if(word[i].charAt(0)=='w')
					{
						Utility.showLines("/home/adminstrato/Nikhil/pattern.txt", 21,29);		
					}
					else
						System.out.println("Given string do not match with any pattern..");
				}
		
		}
}