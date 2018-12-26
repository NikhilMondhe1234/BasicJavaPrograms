/*
 * purpose : Reads the words list from the file and search the element found or not
 * @author : Nikhil Mondhe
 * @since  : 20/11/2018
 * @version: 1.0
 */
package com.bridgelabz.stringandarray;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class BinarySearchWord {

	public static void main(String[] args) {
		String fileName="/home/adminstrato/Desktop/demo";
		String readFile=Utility.readAllFromFile(fileName);
		String[] words=readFile.split(" ");
		Arrays.sort(words);//change the sort method
		int n=words.length-1;
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
		System.out.print("Enter word to search for: ");
		String word = Utility.inputString();

		int index =Utility.stringBinarySearch(words, 0,n,word);
		if(index<0)
		{
			System.out.println("not found");
		}
		else
		{
			System.out.println("found at index " + index);	
		}
	}
}
//}
