package com.bridgelabz.datastructureprogram;

import com.bridgelabz.utility.Utility;

public class PrimeNumberAnagramUsing2DArray {
	public static void main(String args[])
	{
		//called gereic class to used the method 
		MyLinkedList<Integer> myLinkedList=new MyLinkedList<Integer>();
		//created a Myqueue object to check a angram number
		MyQueue<Integer> anagram=new MyQueue<Integer>();
		//created a Myqueue object to check a nonangram number
		MyQueue<Integer> nonanagram=new MyQueue<Integer>();
		for(int i=0;i<1000;i++)
		{
			if(Utility.findprimenumber(i))//Find the prime number given range
			{
				myLinkedList.add(i);//add a element in a list
			}
		}
		for(int i=0;i<myLinkedList.size()-1;i++)
		{
			for(int j=i+1;j<myLinkedList.size();j++)
			{
				//Method is used to check the number anagram 
				if(Utility.numAnagramCheck(myLinkedList.get(i),myLinkedList.get(j)))
				{
					if(anagram.search(myLinkedList.get(i))==false)
					{
						anagram.enqueue(myLinkedList.get(i));//add a element in the list
					}	
					if(anagram.search(myLinkedList.get(j))==false)
					{
						anagram.enqueue(myLinkedList.get(j));
					}
				}
				else
				{
					//check which number is not anagram
					if(nonanagram.search(myLinkedList.get(i))==false && anagram.search(myLinkedList.get(i))==false)
					{
						nonanagram.enqueue(myLinkedList.get(i));//add a element in the list
					}
					if(nonanagram.search(myLinkedList.get(j))==false && nonanagram.search(myLinkedList.get(j))==false)
					{
						nonanagram.enqueue(myLinkedList.get(j));
					}
				}
			}
		}
		Integer[][] array=new Integer[2][nonanagram.size()];
		int anagramQueueSize=anagram.size();
		for(int i=0;i<anagramQueueSize;i++)
		{
			array[0][i]=anagram.dequeue();
		}
		int nonAnagramQueueSize=nonanagram.size();
		for(int j=0;j<nonAnagramQueueSize;j++)
		{
			array[1][j]=nonanagram.dequeue();
		}
		System.out.println();
		System.out.println("Array elements are:");
		System.out.println("first row shows anagram numbers and second row shows non anagram numbers but which are primenumbers");
		//Print the list in 2D array form
		Utility.print2DArrayElement(array);
 	}
}