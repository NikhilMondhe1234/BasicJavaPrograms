/**
 * purpose: Declare the all String Function in one class to create a libaray.
 * @author: Nikhil Mondhe
 * @version: 1.0
 * @since:  29/11/2018
 */
package com.bridgelabz.libraries;

import java.util.Arrays;

public class StringFunction {
	/**
	 * This function is used to check string Anagram 
	 * 
	 * @param str1 First string from user input
	 * @param str2 Second string for user input
	 */
	public static String checkAnagram(String inputString1 ,String inputString2) {
		 int len, len1, len2, i, j, found=0, not_found=0;
		 len1 = inputString1.length();
	        len2 = inputString2.length();
	        
	        if(len1 == len2)
	        {
	            len = len1;
	            for(i=0; i<len; i++)
	            {
	                found = 0;
	                for(j=0; j<len; j++)
	                {
	                    if(inputString1.charAt(i) == inputString2.charAt(j))
	                    {
	                        found = 1;
	                        break;
	                    }
	                }
	                if(found == 0)
	                {
	                    not_found = 1;
	                    break;
	                }
	            }
	                if(not_found == 1)
	                {
	                	System.out.print("Strings are not Anagram to Each Other\n");
	                }
	                else
	                {
	                	System.out.print("Strings are Anagram\n");
	                }
	        }
	        
	            return "Both Strings Must have the same number of Character to be an Anagram";
	        
	    }
	/**
	 * Function is used to remove the space of the string input
	 * 
	 * @param input string provided by the user
	 * @return result the input string
	 */
	public static String removeSpace (String input)
	{
		String temperory="";
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)!= ' ')
			{
				temperory+=input.charAt(i);
			}
		}
		return temperory;
	}
	/**
	 * Function is used check the inputString is palidrome or not 
	 * 
	 * @param inputString string provided by the user
	 * @param s integer take the first character in the string
	 * @param e integer take the last character in the string
	 * @return result true if match
	 */
	public static boolean isPalRec(String inputString, int first,int last)
	{	
		if(first==last)//if there is only one character
		{
			return true;
		}
		if((inputString.charAt(first))!=(inputString.charAt(last)))//if first and last character does not match
		{
			return false;
		}
		if(first<last+1)//if there are more than one character check the middle substring palindrome or not
		{
			return isPalRec(inputString, first + 1, last - 1);
		}
		return true;
	}
	public static boolean isPalindrome(String inputString)
	{
		int n=inputString.length();
		//An empty string is consider as palindrome
		if(n==0)
		{
			return true;
		}
		return isPalRec(inputString, 0, n-1);
	}
	/**
	 * Function used for string Permutation using recursion method
	 * 
	 * @param inputString provide by the user
	 */
	public static void permutation(String inputString) 
	{
		String permute="";
		permuteString(permute,inputString);
	}
	public static void permuteString(String permute, String inputString) 
	{
		@SuppressWarnings("unused")
		int count=0;
		if (inputString.length() == 0) 
		{
			System.out.println(permute);
			count++;
		} 
		else 
		{
			for (int i = 0; i < inputString.length(); i++) 
			{
				permuteString(permute + inputString.charAt(i),inputString.substring(0, i) + inputString.substring(i + 1, inputString.length()));
			}
		}
    }
	/**
	 * Function is used to generate the permutation using Iterative Method
	 * 
	 * @param inputString provided string by the user
	 * @param n count the length of the string
	 */
	public static void permutationIterative(String inputString,int n)
	{
		char[] s = inputString.toCharArray();
		Arrays.sort(s);

		while (true)
		{
			// Print current permutation
			System.out.print(String.valueOf(s) + " ");
			
			// Find largest index i such that s[i-1] is less than s[i]
			int i = n - 1;
			while (s[i-1] >= s[i])// s[j] > s[i–1] (s[i..n-1] is sorted in reverse order)
			{
			// if i is first index of the string, that means we are 
			// already at last possible permutation 
				if (--i == 0)
					return;
			}
			// find highest index j to the right of index i such that 
			int j = n - 1;
			while (j > i && s[j] <= s[i-1])
				j--;

			swap(s, i-1, j);
			reverse (s, i, n-1);
		}
	}
	/**
	 * Function is used for swaping the string
	 * 
	 * @param arr store the character in the array 
	 * @param i integer for store temperory value
	 * @param j integer for store temperory value
	 */
	public static void swap(char[]arr,int i,int j)
	{
		char c = arr[i];
		arr[i] = arr[j];
		arr[j] = c;
	}
	public static void reverse(char[]arr,int i,int j)
	{
		while (i < j) {
			swap(arr, i++, j--);
		}
	}
}
