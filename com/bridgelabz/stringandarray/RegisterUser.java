package com.bridgelabz.stringandarray;
import com.bridgelabz.utility.Utility;

public class RegisterUser {
	public static void main(String args[])
	{
		boolean validation =false;
		String firstName ="";
		System.out.println("Enter your FirstName");
		while(validation!=true)
		{
			firstName=Utility.inputString();
			validation=Utility.validateFirstName(firstName);
			if(validation==false)
			{
				System.out.println("Ensure your name should not have any number and special character");
				System.out.println("Please Enter correct Name ...");
			}
		}
		validation =false;
		System.out.println("Enter your LastName");
		String lastName="";
		while(validation!=true)
		{
			lastName=Utility.inputString();
			validation=Utility.validateLastName(lastName);
			if(validation==false)
			{
				System.out.println("Ensure your name should not have any number and special character");
				System.out.println("Please Enter correct Name ...");
			}
		}
		validation =false;
		System.out.println("Enter your EmailId");
		String email="";
		while(validation!=true)
		{
			email=Utility.inputString1();
			validation=Utility.validateEmailAddress(email);
			if(validation==false)
			{
				System.out.println("Ensure email address is provided");
				System.out.println("Please enter email address.....");
			}
		}
		validation =false;
		System.out.println("Enter your MobileNumber");
		String mobileNumber="";
		while(validation!=true)
		{
			mobileNumber=Utility.inputString1();
			validation=Utility.validatePhoneNumber(mobileNumber);
			if(validation==false)
			{
				System.out.println("Please enter valid Mobile Number");
			}
		}
		validation =false;
		System.out.println("Enter Company name");
		String companyName="";
		while(validation!=true)
		{
			companyName=Utility.inputString1();
			validation=Utility.validateCompanyName(companyName);
			if(validation==false)
			{
				System.out.println("Please enter valid ");
			}
		}
		validation =false;
		System.out.println("Enter UserId");
		String userId="";
		while(validation!=true)
		{
			userId=Utility.inputString1();
			validation=Utility.validateUserId(userId);
			if(validation==false)
			{
				System.out.println("Please enter valid UserID ");
			}
		}
		validation =false;
		System.out.println("Enter password");
		String passwd="";
		while(validation!=true)
		{
			passwd=Utility.inputString1();
			validation=Utility.validatePassword(passwd);
			if(validation==false)
			{
				System.out.println("Password is min 8 char with at least one Uppercase, has exactly one"
						+ "special character and has at least one numberic number in password. And"
						+ "Ensure the password does not have first Name ,lastName,user name or company name");
				System.out.println("Please enter valid password Number......");
			}
		}
		System.out.println("FirstName :"+firstName);
		System.out.println("LastName  :"+lastName);
		System.out.println("Email-ID  :"+email);
		System.out.println("Mobile number :"+mobileNumber);
		System.out.println("Company Name :"+companyName);
		System.out.println("UserId :"+userId);
	}
}