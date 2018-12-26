package com.bridgelabz.datastructureprogram;

import com.bridgelabz.utility.Utility;

public class OrderedList {
 static	MyLinkedList <Integer> mylinkedlist=new MyLinkedList<Integer>();
	public static void main(String[] args) {
		
		Utility utility=new Utility();
		String fileName="/home/adminstrato/Desktop/demo";
		String readFile=utility.readAllFromFile(fileName);
		String[] numberArray=readFile.split(",");
		Integer[] array=new Integer[numberArray.length];
		for(int i=0;i<numberArray.length;i++)
		{
			array[i]=Integer.parseInt(numberArray[i]);
		}
		mylinkedlist.add(array[0]);
		for(int i=1;i<array.length;i++)
		{
			Utility.checkAndAddForOrderedList(array[i], mylinkedlist);
		}
		System.out.println("Linked list numbers are:");
		mylinkedlist.display();
		System.out.println();
		System.out.println("Enter the numbers you want to search");
		int searchNumber=Utility.inputInteger();
		if(mylinkedlist.search(searchNumber))
		{
			int deletenumber = mylinkedlist.index(searchNumber);
			mylinkedlist.pop(deletenumber);
		}
		else
		{
			Utility.checkAndAddForOrderedList(searchNumber, mylinkedlist);
		}
		System.out.println("Linked List Numbers are :");
		mylinkedlist.display();
	}
}