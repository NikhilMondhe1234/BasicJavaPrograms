package com.bridgelabz.stringandarray;

import com.bridgelabz.utility.Utility;

public class PrimePlaidrome {

	public static void main(String[] args) {
		for(int i=0;i<=1000;i++)
		{
			if(Utility.findprimenumber(i) && Utility.isPallindrome(i))
			{
				System.out.println(i+"  ");
			}
		}
	}
} 