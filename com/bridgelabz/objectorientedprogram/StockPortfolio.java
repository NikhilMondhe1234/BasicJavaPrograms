package com.bridgelabz.objectorientedprogram;

import java.util.ArrayList;

public class StockPortfolio {
	private ArrayList<Stock> arraylist=new ArrayList<Stock>();
	public ArrayList<Stock> getArrayList()
	{
		return arraylist;
	}
	
	public void setArrayList( ArrayList<Stock> arraylist)
	{
		this.arraylist=arraylist;
	}

}
