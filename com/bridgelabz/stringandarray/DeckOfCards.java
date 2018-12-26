package com.bridgelabz.stringandarray;

import com.bridgelabz.datastructureprogram.MyLinkedList;
import com.bridgelabz.utility.Utility;

public class DeckOfCards {
	public static void main(String arg[])
	{
		MyLinkedList <String> cards= new MyLinkedList<String>(); 
		String suit[]= {"Spades","Diamond","Hearts","Clubs"};
		String rank[]= {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		String players[][]=new String[4][9];
		for(int i=0;i<suit.length;i++)
		{
			for(int k=0;k<rank.length;k++)
			{
				cards.add(suit[i]+rank[k]);
			}
		}
		cards.display();
		System.out.println();
	System.out.println();	
	Utility.print2DArrayElement(Utility.shuffle(cards,players));
	}
}