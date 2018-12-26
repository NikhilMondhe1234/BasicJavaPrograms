package com.bridgelabz.objectorientedprogram;

public class Stock {
	private String symbol;
	private String stockName;
	private long numberOfShare;
	private long sharePrice;
	private String dateTime;
	
	public String getStockName()
	{
		return stockName;
	}
	public void setStockName(String stockName)
	{
		 this.stockName=stockName;
	}
	public long getNumberOfShare()
	{
		return numberOfShare; 
	}
	public void setNumberOfShare(long numberOfShare)
	{
		this.numberOfShare=numberOfShare;
	}
	public long getSharePrice()
	{
		return sharePrice;
	}
	public void setSharePrice(long sharePrice)
	{
		this.sharePrice=sharePrice;
	}
	public String getdateTime()
	{
		return dateTime;
	}
	public void setdateTime(String dateTime)
	{
		this.dateTime=dateTime;
	}
	public String getsymbol()
	{
		return symbol;
	}
	public void setsymbol(String symbol)
	{
		this.symbol=symbol;
	}
}