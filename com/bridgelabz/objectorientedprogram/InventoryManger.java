package com.bridgelabz.objectorientedprogram;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import com.bridgelabz.utility.Utility;

public class InventoryManger 
{
	static Inventory inventoryObj=new Inventory();
	static final String filePath="/home/bridgeit/Nikhil/inventory.json";
	public static void main(String[] args) throws Exception 
	{
		System.out.println("enter how many types of rice you want to store in the inventory");
		int numberRice=Utility.inputInteger();
		Products rice=new Products();
		for(int i=0;i<numberRice;i++)
		{
			rice=makeRiceObject();
			inventoryObj.getRiceDetails().add(rice);
		}
		System.out.println("enter how many types of wheat you want to store in the inventory");
		int numberWheat=Utility.inputInteger();
		Products wheat=new Products();
		for(int i=0;i<numberWheat;i++)
		{
			wheat=makeRiceObject();
			inventoryObj.getWheatDetails().add(wheat);
		}
		System.out.println("enter how many types of pulses you want to store in the inventory");
		int numberPulses=Utility.inputInteger();
		Products pulses=new Products();
		for(int i=0;i<numberPulses;i++)
		{
			pulses=makeRiceObject();
			inventoryObj.getPulsesDetails().add(pulses);
		}
		
		Utility.convertJavaToJson(inventoryObj,filePath);
		
		JSONParser parser=new JSONParser();
		Object object=parser.parse(new FileReader(filePath));
		JSONObject jsonObject=(JSONObject)object;
		JSONArray riceArray=(JSONArray)jsonObject.get("riceDetails");
		long totalRiceCost = (long) 0;
		for(int i=0;i<riceArray.size();i++)
		{
			JSONObject object1=(JSONObject)riceArray.get(i);
			totalRiceCost=totalRiceCost+(Long) object1.get("weight")*(Long)object1.get("price");
		}
		
		JSONArray wheatArray=(JSONArray)jsonObject.get("wheatDetails");
		long totalWheatCost = (long)0;
		for(int i=0;i<wheatArray.size();i++)
		{
			JSONObject object2=(JSONObject)wheatArray.get(i);
			totalWheatCost+=(Long)object2.get("weight")*(Long)object2.get("price");
		}
		
		JSONArray pulsesArray=(JSONArray)jsonObject.get("pulsesDetails");
		long totalPulsesCost = 0;
		for(int i=0;i<pulsesArray.size();i++)
		{
			JSONObject object3=(JSONObject)pulsesArray.get(i);
			totalPulsesCost+=(Long)object3.get("weight")*(Long)object3.get("price");
		}
		
		System.out.println("Total cost of rice is:"+totalRiceCost);
		System.out.println("Total cost of Wheat is:"+totalWheatCost);
		System.out.println("Total cost of Pulses is:"+totalPulsesCost);
	}
	
	/**
	 * This method is used to take a input from user
	 * 
	 * @return the object of class we created.
	 */
	public static Products makeRiceObject()
	{
		Products rice=new Products();
		System.out.println("Enter the name");
		String name=Utility.inputString();
		rice.setName(name);
		System.out.println("Enter weight");
		long weight=Utility.inputLong();
		rice.setWeight(weight);
		System.out.println("Enter price per kg of the type");
		long price=Utility.inputLong();
		rice.setPrice(price);
		return rice;
	}	
}