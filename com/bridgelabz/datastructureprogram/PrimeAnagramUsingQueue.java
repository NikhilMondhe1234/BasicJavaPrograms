package com.bridgelabz.datastructureprogram;

import com.bridgelabz.utility.Utility;

public class PrimeAnagramUsingQueue {
	public static void main(String arg[])
	{
		//called the Mylinked generic class to store the elements
		MyLinkedList<Integer> myLinkedList=new MyLinkedList<Integer>();
		//create Myqueue object 
		MyQueue<Integer> anagram=new MyQueue<Integer>();
		for(int i=0;i<1000;i++)
		{
			if(Utility.findprimenumber(i))//find the primenumber of given range 
			{
				myLinkedList.add(i);//add a element in the list
			}
		}
		for(int i=0;i<myLinkedList.size()-1;i++)
		{
			for(int j=i+1;j<myLinkedList.size();j++)
			{
				//method is used to check the number is anagram
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
			}
		}
		//Display the anagram in the prime number list
		anagram.display();
	}

}
