package com.bridgelabz.datastructureprogram;

import com.bridgelabz.utility.Utility;

public class UnOrderedList {
	
	public static void main(String[] args) throws Exception {
		MyLinkedList<String> mylinkedlist=new MyLinkedList<String>();
		Utility utility=new Utility();
		String fileName ="/home/adminstrato/Desktop/demo";
		String readfile=utility.readAllFromFile(fileName);
		String numArray[]=readfile.split(" ");
		for(int i=0;i<numArray.length;i++)
		{
			mylinkedlist.add(numArray[i]);
		}
		System.out.println("Linked List elements are :");
		//Display the element in the LinkedList Before Search
		mylinkedlist.display();
		System.out.println();
		System.out.println("Enter the elements you want to search");
		String searchElement=Utility.inputString();
		if(!mylinkedlist.search(searchElement))
		{		
				System.out.println("The enter element is not in the list then we add in the list");
				//Add a Element in a LinkedList
				mylinkedlist.add(searchElement);
		}
		else
		{
			int deletedElement=mylinkedlist.index(searchElement);
			//Remove a element in a LinkedList
			mylinkedlist.pop(deletedElement);
		}
		System.out.println("List of elements are :");
		//Display the element in the LinkedList
		mylinkedlist.display();
	}
}