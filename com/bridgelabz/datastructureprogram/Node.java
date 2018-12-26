package com.bridgelabz.datastructureprogram;

public class Node<T> {
	T element;
	T first;
    Node<T> next;
    Node(T element) {
    	this.element=element;
    } 
    Node (T first,Node<T> next)
    {
    	this.first=first;
    	this.next=next;
    }

}
