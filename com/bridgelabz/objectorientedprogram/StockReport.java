package com.bridgelabz.objectorientedprogram;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

public class StockReport {
	static StockPortfolio stockPortfolio=new StockPortfolio();
	
	public static void main(String arg[]) throws JsonGenerationException ,JsonMappingException,FileNotFoundException, IOException, ParseException,NullPointerException 
	{
		String filePath="/home/adminstrato/Nikhil/stock.json";
		System.out.println("Enter the how much stock you want to store in the market");
		int numberofStock = Utility.inputInteger();
		for(int i=0;i<numberofStock;i++)
		{
			Stock stockobj=new Stock();
			System.out.println("Enter the Stock name");
			stockobj.setStockName(Utility.inputString1());
			System.out.println("Enter the Number of Share");
			stockobj.setNumberOfShare(Utility.inputLong());
			System.out.println("Enter the Share Price");
			stockobj.setSharePrice(Utility.inputLong());
			stockPortfolio.getArrayList().add(stockobj);
		}
		Utility.convertJavaToJson(stockPortfolio, filePath);
		
		JSONParser parser =new JSONParser();	
		Object object=parser.parse(new FileReader(filePath));
		JSONObject jsonObject=(JSONObject)object;
		JSONArray arraylist=(JSONArray)jsonObject.get("arraylist");
		long eachStockvalue=0;
		long totalStockvalue=0;
		for(int j=0;j<arraylist.size();j++)
		{
			JSONObject object1=(JSONObject)arraylist.get(j);
			eachStockvalue+=((Long)object1.get("numberOfShare"))*((Long)object1.get("sharePrice"));
			totalStockvalue+=eachStockvalue;
			System.out.println("Stock name"+object1.get("stockName")+" "+eachStockvalue);
			eachStockvalue=0;
		}
		System.out.println("Total Share price is :"+totalStockvalue);
	}
}