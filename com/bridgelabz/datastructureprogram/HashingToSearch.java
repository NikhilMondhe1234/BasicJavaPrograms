package com.bridgelabz.datastructureprogram;

import com.bridgelabz.utility.Utility;

public class HashingToSearch {
	public static void main(String[] args)
	{
		Utility utility=new Utility();
		//Read the File from the specfied path 
		String readedFile=utility.readAllFromFile("/home/bridgeit/Nikhil/demo");
		//System.out.println(readedFile);
		String[] numArray=readedFile.split(",");//This is used to split the file content
		Integer[] array=new Integer[numArray.length];
		for(int i=0;i<numArray.length;i++)
		{
			array[i]=Integer.parseInt(numArray[i]);//convert the String to Integer
		}
		@SuppressWarnings("unchecked")
		//called MyLinkedList generic class to store the list of array
		MyLinkedList<Integer>[] listArray=new MyLinkedList[11];
		int index=0;
		for(int i=0;i<listArray.length;i++)
		{
			listArray[i]=new MyLinkedList<Integer>();
		}
		for(int i=0;i<array.length;i++)
		{
			//System.out.println(array[i]); 
			index=array[i]%11;
			//System.out.println(index);
			listArray[index].add(array[i]);
			
		}
		for(int i=0;i<listArray.length;i++)
		{
			for(int j=0;j<listArray[i].size();j++)
			{
				System.out.print(listArray[i].get(j)+" ");
			}
			System.out.println();
		}
		//Search the number in the list
		System.out.println("enter which number you want to search");
		int searchNumber=Utility.inputInteger();
		//find the remainder to set the index
		index=searchNumber%11;
		if(listArray[index].search(searchNumber)==false)
		{
			//Add a number in the list
			listArray[index].add(searchNumber);
		}
		else
			//remove the number in the list
			listArray[index].remove(searchNumber);
		System.out.println("Linked list array elements after search operation:");
		String temporary="";
		for(int i=0;i<listArray.length;i++)
		{
			for(int j=0;j<listArray[i].size();j++)
			{
				temporary+=listArray[i].get(j)+",";
				System.out.print(listArray[i].get(j)+" ");
			}
			System.out.println();
		}
		//write a file to specfied path and store the number in the list
		utility.writeAllToFile("/home/bridgeit/Nikhil/demohashing", temporary);
		String readedFile2=utility.readAllFromFile("/home/bridgeit/Nikhil/demohashing");
		System.out.println(readedFile2);
	}
}
