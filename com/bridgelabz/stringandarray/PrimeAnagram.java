package com.bridgelabz.stringandarray;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.bridgelabz.utility.Utility;

public class PrimeAnagram {

	public static void main(String[] args)
	{
		List<Integer> list=new ArrayList<Integer>();
		Set<Integer> distinctElement=new TreeSet<Integer>();
		for(int i=0;i<=1000;i++)
		{
			if(Utility.findprimenumber(i))
			{
				list.add(i);
			}
		}			
		for(int i=0;i<list.size()-1;i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(Utility.numAnagramCheck(list.get(i),list.get(j)))
				{
					distinctElement.add(list.get(i));
					distinctElement.add(list.get(j));
				}
			}
		}
		System.out.println(distinctElement);
	}
}