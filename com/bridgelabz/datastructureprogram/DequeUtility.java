package com.bridgelabz.datastructureprogram;

public class DequeUtility<E>
{
	public DequeUtility(){	
	}
	
	Deque<E> front;
	Deque<E> rear;
	int size=0;
	
	//add front
	@SuppressWarnings("null")
	public void addFront(E c)
	{
		//if no element in list
		if(front==null) 
		{
			front.data=c;
			rear=front;
		}
		else  //if element in list
		{
			Deque<E>tNode=null;
			tNode.data=c;
			tNode.next=front;
			front.pre=tNode;
			front=tNode;
		}
		size++;
	}
	
	//add the element in the rear 
	public void addRear(E c)
	{
		if(front==null) //if no element in list
		{
			Deque<E>tNode=new Deque<E>(c);
			front=tNode;
			rear=front;
		}
		else  //if element in list
		{
			Deque<E>tNode=new Deque<E>(c);
			rear.next=tNode;
			tNode.pre=rear;
			rear=tNode;
		}
		size++;
	}
	

	/**
	 * Function is used to remove the elements in front of the deque
	 * 
	 * @return output is the element of front in the deque
	 */
	public E removeFront()
	{
		E value=null;
		if(front==null)
		{
			System.out.println("No elements to delete");
		}
		else
		{
			value=front.data;
			front=front.next;
		}
		size--;
		return value;
	}
	
	/**
	 * Function is used to remove the last element in the dqueue
	 * 
	 * @return the element which are remove in the deqeue
	 */
	public E removeRear()
	{
		E value=null;
		if(front==null)
		{
			System.out.println("No element to delete");
		}
		else
		{
			value=rear.data;
			rear=rear.pre;
			rear.next=null;
		}
		size--;
		return value;
	}
	/**
	 * Function is used to remove the element in the deque
	 * @return 
	 */
	public boolean isEmpty()
	{
		if(front==null)
			return true;
		else
			return false;
	}
 
	/**
	 * @return the size of the element in the deque
	 */
	public int size()
	{
		return size;
	}
}
