package com.bridgelabz.datastructureprogram;

import com.bridgelabz.utility.Utility;

public class PrimeNumberAnagramUsingStack {
	public static void main(String[] args) 
	{
		//called generic class to used the method 
		MyLinkedList<Integer> mylinkedlist=new MyLinkedList<Integer>();
		MyStack<Integer> mystack=new MyStack<Integer>();
		for(int i=0;i<=1000;i++)
		{
			if(Utility.findprimenumber(i))//Find the prime number given range
			{
				mylinkedlist.add(i);//add a element in a list
			}
		}
		for(int i=0;i<mylinkedlist.size()-1;i++)	
		{
			for(int j=i+1;j<mylinkedlist.size();j++)
			{
				//Method is used to check the anagram number 
				if(Utility.numAnagramCheck(mylinkedlist.get(i),mylinkedlist.get(j)))
				{
					mystack.push(mylinkedlist.get(i));
					mystack.push(mylinkedlist.get(j));
				}
			}
		}
		//Display the anagram using stack
		mystack.display();
	}
}