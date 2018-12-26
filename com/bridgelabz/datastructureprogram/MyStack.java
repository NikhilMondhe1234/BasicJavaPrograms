package com.bridgelabz.datastructureprogram;

public class MyStack<T>{
	
	MyLinkedList<T> mylinkedlist = new MyLinkedList<T>();
	
	public MyStack()
	{
		
	}
	public void push(T element)
	{
		mylinkedlist.add(element);
	}
	public T pop()
	{
		int index=mylinkedlist.size()-1;
		T elementToBeDeleted=mylinkedlist.get(index);
		mylinkedlist.remove(index);
		return elementToBeDeleted;
	}
	public T peek()
	{
		return mylinkedlist.get(mylinkedlist.size()-1);
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
		for(int i=mylinkedlist.size()-1;i>=0;i--)
		{
			System.out.println(mylinkedlist.get(i));
		}
	}
}