package com.bridgelabz.objectorientedprogram;

import java.util.Date;
import java.text.SimpleDateFormat;
import com.bridgelabz.utility.Utility;

public class RegularExpression {
	public static void main(String arg[])
	{
		//Take a input as a fullName
		System.out.println("Enter your full Name");
		String fullName=Utility.inputString();
		//Take a input as a phoneNumber
		System.out.println("Enter your phone Number");
		String phoneNumber=Utility.inputString();
		//Split the fullName in an array
		String[] splitArray=fullName.split(" ");
		//Allocated the name to the firstName 
		String firstName=splitArray[0];
		String date=dateofToday();
		System.out.println(firstName);
		String template ="Hello <<name>>, We have your full name as <<full name>> in our system. "
						+"your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification. "
						+"Thank you BridgeLabz 01/01/2016";
		String regexName="<<name>>";
		String regexFullName="<<full name>>";
		String regexPhoneNumber="xxxxxxxxxx";
		String regexDate="01/01/2016";
		
		//Method is used for replace the operation
		template=Utility.replaceOperation(template,regexName,firstName);
		template=Utility.replaceOperation(template,regexFullName,fullName);
		template=Utility.replaceOperation(template,regexPhoneNumber,phoneNumber);
		template=Utility.replaceOperation(template,regexDate,date);
		System.out.println(template);
	}
	//Method is used to print the date format
	private static String dateofToday() {
		
		SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
		Date date=new Date();

		return formatter.format(date);
	}//change the rePLACE METHOD PATTERN 
}