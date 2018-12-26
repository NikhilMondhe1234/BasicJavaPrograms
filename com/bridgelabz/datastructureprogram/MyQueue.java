package com.bridgelabz.datastructureprogram;

public class MyQueue<T> {
	MyLinkedList<T> mylinkedlist=new MyLinkedList<T>();
	
	public MyQueue()
	{
		
	}
	public void enqueue(T element)
	{
		mylinkedlist.add(element);
	}
	public T dequeue()
	{
		if(mylinkedlist.isEmpty())
		{
			System.out.println(" Element Queue is not present");
		}
		T elementdeleted =mylinkedlist.get(0);
		mylinkedlist.remove(0);
		return elementdeleted;
	}
	public boolean isEmpty()
	{
		return mylinkedlist.size()==0;
	}
	public int size()
	{
		return mylinkedlist.size();
	}
	public void display()
	{
		mylinkedlist.display();
	}
	public boolean search(T searchElement)
	{
		return mylinkedlist.search(searchElement);
	}
}