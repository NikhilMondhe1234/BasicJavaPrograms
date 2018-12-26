package com.bridgelabz.utility;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.impl.DefaultPrettyPrinter;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import com.bridgelabz.datastructureprogram.MyLinkedList;
import com.bridgelabz.datastructureprogram.MyStack;


/**
 * @author Nikhil Mondhe
 *
 */
@SuppressWarnings("deprecation")
public class Utility {
	
	 static Scanner  scanner = new Scanner(System.in);
	
	/**
	 * This method takes an input boolean form the user and passes it
	 * on to the method where it is called
	 * 
	 * @return boolean a user given boolen value
	 */
	public  static boolean inputBoolean() {
		return scanner.nextBoolean();
	}
	/**
	 * This method takes an input Long from the user and passes it 
	 * on to the method where it is called
	 * 
	 * @return The Long which is passed as input to the scanner
	 */
	public static long inputLong() {
		return scanner.nextLong();
		}
	/**
	 * This method takes an input Float from the user and passes it 
	 * on to the method where it is called
	 * 
	 * @return The Float which is passed as input to the scanner
	 */
	public static float inputFloat() {
		return scanner.nextFloat();
	}
	
	/**
	 * This method takes an input Double from the user and passes it 
	 * on to the method where it is called
	 * 
	 * @return The double which is passed as input to the scanner
	 */
	public static double inputDouble() {
		return scanner.nextDouble();
	}
	
	/**
	 * This method takes an input String from the user and passes it 
	 * on to the method where it is called
	 * 
	 * @return The string which is passed as input to the scanner
	 */
	public static String inputString() {
		return scanner.nextLine();
	}
	
	/**
	 * This method takes an input String from the user and passes it 
	 * on to the method where it is called
	 * 
	 * @return The string which is passed as input to the scanner
	 */
	public static String inputString1() {
		return scanner.next();
	}
	
	
	/**
	 * This method takes an input Integer from the user and passes it 
	 * on to the method where it is called
	 * 
	 * @return The integer which is passed as input to the scanner
	 */
	public static int inputInteger() {
		return scanner.nextInt();
	}
	

	/**
	 * This method is used to replace the string template with the 
	 * provided input given by the user.
	 * 
	 * @param userName input given by the user
	 * @param template string which needs to be modified
	 * @return output the out string given back to the user
	 */
	
	public static String replaceString(String userName, String template) {
		if (userName.length() <= 3)
			return "Please input string with more than 3 characters";
		else {
			String output = template.replace("<<UserName>>", userName);
			return output;
		}
	}
	
	/**
	 * Function is used to find the Harmonic number input 
	 * 
	 * @param n number upto which harmonic number should be calculated
	 * @return double which is the n'th harmonic number
	 */
	 public static double printNthHarmonic(int n) {         //function to print Nth harmonic number, i.e 1/1 + 1/2 + .... + 1/N
		
		double nthHarmonicNumber = 0;
		if (n < 0) {
			System.out.println("invalid number");

		} else {
			for (double i = 1; i <= n; i++)// for floating point operations atleast one operand should be double or
				// float
			{
				//System.out.println(i);
				nthHarmonicNumber += 1 / i;
			}
			
		}
		return nthHarmonicNumber;
	 }
	/**
	 * Function is used to print the harmonic value all upto given number
	 *   
	 * @param number provided by the user 
	 * @return output the harmonic number 
	 */
	 public static double printHarmonicSeries(int number) {
		 System.out.print("The Harmonic Series is : ");
	        double result = 0.0;
	        while(number > 0)
	          {
	               result = result + (double) 1 / number;
	               number--;
	               System.out.print(result +"  ");
	          }
	      System.out.println("");
	      return result;
	 }
	/**
	 * Function used to check the leap year
	 * 
	 * @param year integer the user entered 
	 * @return gernerted wrong message 
	 */
	public static String checkLeapYear(int year) {  
		if (year >= 1582 && year <= 9999) {
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {

				return "Leap Year";
			} else {

				return "not a Leap Year";
			}
		} else {
			return "You have entered a wrong year";
		}
	}

	/**
	 * This function is used to find the Quadratic roots of the number
	 * 
	 * @param a integer takes input first number 
	 * @param b integer takes input second number
	 * @param c integer takes input third number
	 */
	public static void findroots(int a,int b, int c)
	{
		if(a==0)
		{
			System.out.println("Invaild");
			return;
		}
		
		int d = b*b - 4*a*c;  
		double sqrt_val = sqrt(d);//change
		if(d > 0)
		{
			System.out.println("The Root are real and different");
			System.out.println((double)(-b + sqrt_val) / (2*a)+"\n"+
       					   	   (double)(-b - sqrt_val) / (2*a));
		}	
		else
		{
			System.out.println("Roots are complex \n"); 
	        System.out.println( -(double)b / ( 2 * a ) +"+i"+sqrt_val +"\n"+
	        					-(double)b / ( 2 * a ) +"-i"+sqrt_val);
		}
	}
	/**
	 * This method is used to find the prime factor with the input 
	 * provided by the user.
	 * 
	 * @param number Integer take user input 
	 * @return 
	 */
	
	public static int primefactor(int number) {
		int temp=0;
		while(number%2==0)
		{
			System.out.println("2");
			number/=2;
		}
		for (int i=3;i<Math.sqrt(number);i+=2)
		{
			while(number%i==0)
			{
				System.out.println(i);
				number/=i;
			}
		}
		if(number>2)
		{
			temp=number;
		}
		return temp;
	}
	
	/**
	 * This method is used to calculate  the Windchill which is 
	 * value taken form the user.
	 * 
	 * @param temperature double this taken as a input
	 * @param windspeed double this taken by the user
	 * @return output given by to user as a output
	 * 
	 */
	
	public static double findwindchill(double temperature, double windspeed) {
		double output = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windspeed, 0.16);
		
		return output;
	}
	
	/**
	 * Function is used to calculate the number of times a 
	 * player wins and looses in gambling
	 * 
	 * @param stake number that a player have
	 * @param goal number, the player have to make to win
	 * @param chance number of times the player is allowed to play
	 */
	
	public static void calWinLossInGambling(int stake, int goal, int chance) {       
		int win = 0;
		int loss = 0;

		for (int i = 0; i < chance; i++) {
			while (stake < goal && stake > 0 && chance > 0) {
				if (Math.random() < 0.5)
				{
					stake++;
					win++;
					chance--;
				} 
				else 
				{
					stake--;
					loss++;
					chance--;
				}
			}
		}
		double percentWin = (win * 100) / (win + loss);
		double percentLoss = (loss * 100) / (win + loss);
		System.out.println("The player won " + win + " times.");
		System.out.println("The player lost " + loss + " times.");
		System.out.println("percentage of win is " + percentWin + "%");
		System.out.println("percentage of loss is " + percentLoss + "%");
		
	}

	/**
	 * Function is used to find the distance of Quadrant
	 * 
	 * @param x First quadrant
	 * @param y Second quadrant
	 * @return output
	 */
	public static double finddistance(int x, int y) {
		
		return Math.sqrt(Math.pow(x-y,2)+Math.pow(x-y,2)*1.0);	
		
	}
	/**Function is used to calculate the percentage of head tails after filliped a coin
	 * @param numberOfTimes
	 */
	public static void percentOfHeadTail(int numberOfTimes) {         
		
		double tail = 0;
		double head = 0;
		 
		double percentHead;
		double percentTail;
		for (int i = 0; i < numberOfTimes; i++) {
			if (Math.random() < 0.5) {
				tail++;
			} else {
				head++;
			}
		}

		percentHead = (head / numberOfTimes) * 100;
		percentTail = (tail / numberOfTimes) * 100;

		System.out.println("percentage of head is " + percentHead);
		System.out.println("percentage of tail is " + percentTail);
	}

	/**
	 * This function is used to check string Anagram 
	 * 
	 * @param str1 First string from user input
	 * @param str2 Second string for user input
	 */
	
	public static String checkAnagram(String str1 ,String str2) {
		 int len, len1, len2, i, j, found=0, not_found=0;
		 len1 = str1.length();
	        len2 = str2.length();
			
	        if(len1 == len2)
	        {
	            len = len1;
	            for(i=0; i<len; i++)
	            {
	                found = 0;
	                for(j=0; j<len; j++)
	                {
	                    if(str1.charAt(i) == str2.charAt(j))
	                    {
	                        found = 1;
	                        break;
	                    }
	                }
	                if(found == 0)
	                {
	                    not_found = 1;
	                    break;
	                }
	            }
	                if(not_found == 1)
	                {
	                	System.out.print("Strings are not Anagram to Each Other");
	                }
	                else
	                {
	                	System.out.print("Strings are Anagram");
	                }
	        }
	        
	        
	            return "Both Strings Must have the same number of Character to be an Anagram";
	        
	    }
	/**
	 * Function is used check the inputString is palidrome or not 
	 * 
	 * @param inputString string provided by the user
	 * @param s integer take the first character in the string
	 * @param e integer take the last character in the string
	 * @return result true if match
	 */
	public static boolean isPalRec(String inputString, int first,int last)
	{	
		if(first==last)//if there is only one character
		{
			return true;
		}
		if((inputString.charAt(first))!=(inputString.charAt(last)))//if first and last character does not match
		{
			return false;
		}
		if(first<last+1)//if there are more than one character check the middle substring palindrome or not
		{
			return isPalRec(inputString, first + 1, last - 1);
		}
		return true;
	}
	public static boolean isPalindrome(String inputString)
	{
		int n=inputString.length();
		//An empty string is consider as palindrome
		if(n==0)
		{
			return true;
		}
		return isPalRec(inputString, 0, n-1);
	}
	
	/**
	 * Function used for string Permutation using recursion method
	 * 
	 * @param inputString provide by the user
	 */
	public static void permutation(String inputString) 
	{
		String permute="";
		permuteString(permute,inputString);
	}
	public static void permuteString(String permute, String inputString) 
	{
		@SuppressWarnings("unused")
		int count=0;
		if (inputString.length() == 0) 
		{
			System.out.println(permute);
			count++;
		} 
		else 
		{
			for (int i = 0; i < inputString.length(); i++) 
			{
				permuteString(permute + inputString.charAt(i),inputString.substring(0, i) + inputString.substring(i + 1, inputString.length()));
			}
		}
    }
	/**
	 * Function is used to generate the permutation using Iterative Method
	 * 
	 * @param inputString provided string by the user
	 * @param n count the length of the string
	 */
	public static void permutationIterative(String inputString,int n)
	{
		char[] s = inputString.toCharArray();
		Arrays.sort(s);

		while (true)
		{
			// Print current permutation
			System.out.print(String.valueOf(s) + " ");
			
			// Find largest index i such that s[i-1] is less than s[i]
			int i = n - 1;
			while (s[i-1] >= s[i])// s[j] > s[i–1] (s[i..n-1] is sorted in reverse order)
			{
			// if i is first index of the string, that means we are 
			// already at last possible permutation 
				if (--i == 0)
					return;
			}
			// find highest index j to the right of index i such that 
			int j = n - 1;
			while (j > i && s[j] <= s[i-1])
				j--;

			swap(s, i-1, j);
			reverse (s, i, n-1);
		}
	}
	/**
	 * Function is used for swaping the string
	 * 
	 * @param arr store the character in the array 
	 * @param i integer for store temperory value
	 * @param j integer for store temperory value
	 */
	public static void swap(char[]arr,int i,int j)
	{
		char c = arr[i];
		arr[i] = arr[j];
		arr[j] = c;
	}
	public static void reverse(char[]arr,int i,int j)
	{
		while (i < j) {
			swap(arr, i++, j--);
		}
	}
	
	/**
	 * Function is used to find prime numbers
	 * 
	 * @param number integer provided by the user
	 */
	
	public static boolean findprimenumber(int number) {

		for(int j=2;j<=number/2;j++)
		{
			int rem =number%j;
			if(rem==0)
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * Function is used to sort the words by using insertion algorithm
	 * 
	 * @param words it given input from user
	 */
	
	public static String[] insertionSortWords(String[] words) {
		int number=words.length;
		String value;
		int index = 0;
		for (int i=1;i<number;i++)
		{
			char currentcharvalue =words[i].charAt(0);
			value= words[i];
			index=i;

            if(currentcharvalue == words[i - 1].charAt(0))
            {
                while (index > 0 && words[index - 1].charAt(1) > words[index].charAt(1))
                {
                    words[index] = words[index - 1];
                    index = index - 1;
                }
            }
            else
            {
                while (index > 0 && words[index - 1].charAt(0) > currentcharvalue)
                {
                    words[index] = words[index - 1];
                    index = index - 1;
                }
            }
             words[index] = value;
        }
		return words;
	}
	
	/**
	 * Function is used to merge the elements and separated
	 * into two halves
	 * 
	 * @param array integer taken a array number from the user
	 * @param First integer the number is first element form array
	 * @param mid integer is the middle value of array
	 * @param Last integer the number is last element from array
	 */
	public static void merge(int array[], int First, int mid, int last) 
    { 
         
        int n1 = mid - First + 1; 
        int n2 = last - mid; 
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
        for (int i=0; i<n1; ++i) 
            L[i] = array[First + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = array[mid + 1+ j]; 

        int i = 0, j = 0;         
        int k = First; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                array[k] = L[i]; 
                i++; 
            } 
            else
            { 
                array[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < n1) 
        { 
            array[k] = L[i]; 
            i++; 
            k++; 
        } 
        while (j < n2) 
        { 
            array[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
	
	/**
	 * Function is used to sort the number which is provided
	 * by the user
	 * 
	 * @param array taken as a input from user
	 * @param First integer the number is first element form array
	 * @param Last integer the number is last element from array
	 */
	public static void sort(int array[], int First, int last) 
    { 
        if (First < last) 
        { 
            int mid = (First+last)/2; 
            sort(array, First, mid); 
            sort(array , mid+1, last); 
            merge(array, First, mid, last); 
        } 
    } 
	
	/**
	 * Function is used to display the array 
	 * 
	 * @param array integer taken a array number from the user
	 */
	public static void printArray(int array[]) 
    { 
        int number = array.length; 
        for (int i=0; i<number; ++i) 
            System.out.print(array[i] + " "); 
        System.out.println();
    } 
	/**
	 * Function to print the power of 2 upto the given range of power
	 * 
	 * @param n number to print all the power value of 2 upto 'n'th power of 2
	 */
	public static String printPowOf2(int n) {         //
		if (n >= 0 && n < 31) 
		{
			for (int i = 0; i <= n; i++) 
			{
				System.out.println("2^" + i + "=" + (int) Math.pow(2, i));
			}
		}  
		
			return "You have entered a number which is out of the range";
	}
	/**
	 * Function is used to print Two Dimenional array
	 * 
	 * @param option a number which is given as option to create an array
	 */
	public static void print2DArray(int option)
	{
		System.out.println("enter number of rows of the 2D array");
		int row=Utility.inputInteger();
		System.out.println("enter number of columns of the 2D array");
		int col=Utility.inputInteger();
		System.out.println("enter elements of the 2D array row wise");
		Integer[][] intArray;
		Double[][] doubleArray;
		Boolean[][] boolArray;
		switch(option)
		{
		case 1:
			intArray=new Integer[row][col];
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					intArray[i][j]=Utility.inputInteger();
				}
			}
			//print2DArrayElement(intArray);
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(intArray[i][j]+" ");
				}
				System.out.println();
			}
			break;
		case 2:
			doubleArray=new Double[row][col];
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					doubleArray[i][j]=Utility.inputDouble();
				}
			}
			//print2DArrayElement(doubleArray);
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(doubleArray[i][j]+" ");
				}
				System.out.println();
			}
			break;
		case 3:
			boolArray=new Boolean[row][col];
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					boolArray[i][j]=Utility.inputBoolean();
				}
			}
			print2DArrayElement(boolArray);
			/*for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(boolArray[i][j]+" ");
				}
				System.out.println();
			}*/
			break;
		default:
			System.out.println("you have given one invalid input");
		}

	}
	
	/**
	 * Function to print elements of any type of 2D array
	 * 
	 * @param inputArray the array element to be sorted.
	 */
	
	public static <E> void print2DArrayElement(E[][] inputArray)
	{
		for (E[] outerElements : inputArray) 
		{
			for (E innerElements : outerElements) 
			{
				System.out.print(innerElements+" ");
			}
			System.out.println();
		}
	}

	/**
	 * This function is used to sort the number by using bubbleSort Algorithm
	 * 
	 * @param num integer array provided the value through user
	 */
	public static int[]  bubbleSort(int[] num) {
		int n=num.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(num[j]>num[j+1])
				{
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		return num;
	}

	/**
	 * This method is used to find the word from the list using binary search algorithm.
	 *  
	 * @param word String is taken input from user
	 * @param words are string array to store the list 
	 * @param a integer  
	 * @param b integer
	 * @return the middle value from string array
	 */
	
	public static int binarysearchWord(String[] words, int a, int b,String word) {
		if(b <= a)
			return -1;
		
		if(b - a == 1)
			return words[a].equals(word) ? a : -1;

		int mid = (a + b)/2;
		
		if(word.compareTo(words[mid]) < 0)
		{
			return binarysearchWord(words, 0, mid-1,word);
		}
		else if(word.compareTo(words[mid]) > 0)
		{
			return binarysearchWord(words, mid, b,word);
		}
		return mid;
	}

	/**
	 * This function is used to find the number which is provided 
	 * input by the user
	 * 
	 * @param array provide the list from the user 
	 * @param first integer first number in an array
	 * @param last integer last number in an array
	 * @param key integer this number you want find  
	 */
	
	public void binarySearchInteger(int[] array, int first, int last, int key) {
		int mid = (first + last)/2;  
		while( first <= last )
		{  
			if ( array[mid] < key )
		    {  
				first = mid + 1;     
		    }
		    else if ( array[mid] == key )
		    {  
		    	System.out.println("Element is found at postion: " + mid);  
		        break;  
		    }
		    else
		    {  
		    	last = mid - 1;  	
		    }  
		    mid = (first + last)/2;  
		}  
		   if ( first > last )
		   {  
		      System.out.println("Element is not found!");  
		   }  
	}

	/**
	 * This method is used to find the word from the list using binary search algorithm.
	 *  
	 * @param searchString String is taken input from user
	 * @param first are string array to store the list 
	 * @param start integer  
	 * @param end integer
	 * @return the condtion is not true return -1
	 */
	public static int stringBinarySearch(String first[], int start, int end, String searchString){
		if(start<=end)
		{
			int mid = (start+end)/2;

			if(first[mid].equals(searchString)){
	        return mid;
			}
			if(searchString.compareTo(first[mid])<0){
				return stringBinarySearch(first, start, mid-1, searchString);
			}
			else {
				return stringBinarySearch(first, mid+1, end, searchString);
			}
		}
	    return -1;
	  }
	/**
	 * Function is used how many change the user want
	 * 
	 * @param requiredAmount the amount which we calculate the change
	 */
	
	public static void giveMinimumChange(int requiredAmount) 
	{
		int[] notesAvailable= {1000,500,100,50,10,5,2,1};
		int i=0;
		int count=0;
		int quotient=0;
		while(requiredAmount>=1)
		{
			quotient=requiredAmount/notesAvailable[i];
			if(quotient>0)
			{
				System.out.println(notesAvailable[i]+"Rs. note="+quotient);
				count=count+quotient;
				requiredAmount=requiredAmount%notesAvailable[i];
			}		
			i++;
		}
		System.out.println("minimum number of notes required is ="+count);		
	}

	/**
	 * Function is used to convert temperature Fahrenheit to Celsius
	 *  
	 * @param fahrenheit take user input temperature as a Fahrenheit  
	 */
	public static double temperatureinCelsius(double fahrenheit) {
		
		double Celsius=(fahrenheit-32)*5/9;
		return Celsius; 
	}

	/**
	 * Function is used to convert temperature Celsius to Fahrenheit 
	 *  
	 * @param celsius take user input temperature as a celsius
	 */
	public static double temperatureinFahrenheit(double celsius) {
		
		double fahrenheit=(celsius*9/5)+32;
		return fahrenheit;
	}

	/**
	 * Function is used to find the square root using Newton Method 
	 * 
	 * @param c the number whose square root value will be calculated by using newtons method
	 * @return returns the square root value of the given number
	 */
	public static double sqrt(int c) 
	{
		 double t=c;
         double epsilon=1e-15;
         while(Math.abs(t-c/t) > epsilon*t)
         {
             t = (c/t + t)/2;
         }
         return t;
		
	}

	/**
	 * Function is used to calculate the MonthlyPayment
	 * 
	 * @param principal it is the principal amount
	 * @param numberOfYears it is the number of years in which the user have to earn the repay amount
	 * @param rateOfIntrest it is the rate of interest
	 * @return output final monthly payment
	 */
	public static double calmonthlyPayment(double principal, double numberOfYears, double rateOfIntrest) 
	{
		 double payment;
		 double r =rateOfIntrest/(12*100);
		 double months=12 * numberOfYears;
		 payment= (principal*r)/(1-1/(Math.pow((1+r), months)));
		 return payment;
	}
	/**
	 * Function is used to convert decimal to binary
	 * 
	 * @param decimal the decimal number which is converted into binary
	 * @return the binary number which is type of string
	 */
	public static String decimalToBinary(int decimal) 
	{
		String binaryNumberInString="";
		String temporary="";
		int number=decimal;
		while(number>=1)
		{
			binaryNumberInString=binaryNumberInString+number%2;
			number=number/2;
		}
		if(binaryNumberInString.length()>0 && binaryNumberInString.length()<8)
		{
			binaryNumberInString+=giveZero(8-binaryNumberInString.length());
		}
		for(int i=binaryNumberInString.length()-1;i>=0;i--)
		{
			temporary+=binaryNumberInString.charAt(i);
		}
		binaryNumberInString=temporary;
		return binaryNumberInString;
	}
	
	/**
	* @param numberofzeroRequired the number of zero the user needs
	* @return the string value 
	*/
	public static String giveZero(int numberofzeroRequired) {
		String s ="";
		for(int i=0;i<numberofzeroRequired;i++)
		{
			s=s+0;
		}
		return s;
	}
	/**
	 * @param binary the binary number which is in string type, and will converted in decimal value
	 * @return returns decimal value of the given binary
	 */
	public static int binaryToDecimal(String binary)
	{
		int decimal=0;
		int index=0;
		for(int i=binary.length()-1;i>=0;i--)
		{
			if(binary.charAt(i)=='1')
			{
				decimal=decimal+(int)Math.pow(2, index);
			}
			index++;
		}
		return decimal;
	}
	/**
	 * Function is show the sin taylor function "x-x^3/3!+x^5/5!-x^7/7!....."
	 * 
	 * @param number 
	 * @param theta 
	 * @return the output 
	 */
	public static double sinTaylor(int number,double theta)
	{
		theta= theta % (2*Math.PI);
		int power=1;
		double sinX= 0.0;
		for(int i=1;i<=number;i++)
		{
			double currentTerm = 0.0;
			if(i%2==0)
			{
				currentTerm = Math.pow(theta,power)/factorial(power);
			}
			else
			{
				currentTerm = Math.pow(theta,power)/factorial(power);
			}
			sinX=sinX+currentTerm;
			power=power+2;
		}
		return sinX;
	}
	
	/**
	 * @param low the lowest value from which search operation starts 
	 * 		  each time when the method is called
	 * @param high the highest value upto which search operation will 
	 * 		  continue when the method is called
	 * @return the (index of the element)/index which the user thought of
	 */
	public static int search(int low, int high)
	{
		int mid=low+(high-low)/2;
		if(low<high)
		{
			System.out.println("Is your number in between "+low+" and "+mid);
			if(Utility.inputBoolean())
			{
				return search(low,mid);
			}
			else
			{
				return search(mid+1,high);
			}
		}
		else
		{
			System.out.println("the number is "+low);
			return low;
		}
	}
	/**
	 * Function is used to find the day of week in calendar
	 * 
	 * @param month integer is the month of the calendar
	 * @param day integer is the day of the calendar
	 * @param year integer is the year of the calendar
	 * @return output is the day of week 
	 */
	
	public static int dayofWeek(int date,int month,int year) {
		
		  int y0 = year - (14 - month) / 12;
	      int x = y0 + y0/4 - y0/100 + y0/400;
	      int m0 = month + 12 * ((14 - month) / 12) - 2;
	      int d0 = (date + x + (31*m0)/12) % 7;
	      return d0;
	}
	/**
	 * Function is used to check the pallindrome prime numbers
	 * 
	 * @param number which is to be checked for pallindrome
	 * @return true if the given number is pallindrome,false if it is not
	 */
	public static boolean isPallindrome(int number) 
	{
		int temp=number;
		int reverseNumber=0;
		while(number>0)
		{
			int remainder= number%10;
			reverseNumber=(reverseNumber*10)+remainder;
			number/=10;
		}
		return (temp==reverseNumber);
	}
	/**
	 * Function is used to sort the word in a string using bubblesort algorthim
	 * 
	 * @param string the word which is to be sorted
	 * @return the sorted string
	 */
	public static String stringBubbleSortByLetter(String string) 
	{
		char[] array=string.toCharArray();
		char temporary=' ';
		for(int i=0;i<string.length()-1;i++)
		{
			for(int j=0;j<string.length()-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					temporary=array[j];
					array[j]=array[j+1];
					array[j+1]=temporary;
				}
			}
		}
		string=new String(array);
		return string;
	}
	/**
	 * Function is used to check NumAnagramCheck with all type datatype
	 * 
	 * @param number1 the first number which will be checked with the second number for anagram
	 * @param number2 the first number which will be checked with the second number for anagram
	 * @return true if the given numbers are anagram
	 */
	public static <T> boolean numAnagramCheck(T number1, T number2) 
	{
		String tempNumber1=number1+"";
		String tempNumber2=number2+"";
		return (Utility.stringBubbleSortByLetter(tempNumber1).equals(Utility.stringBubbleSortByLetter(tempNumber2)));
		
	}
	
	/**
	 * Function is used to sum of three integer
	 * 
	 * @param b array elements take user input
	 * @param length 
	 * @return return number of distinct triplets (i, j, k) such that a[i] + a[j] + a[k] = 0
	 */
	public static int findDistinctTriplets(int b[],int length)
	{
		System.out.println();
		int i,j,k,count=0;
		for(i=0;i<length;i++)
		{
			for(j=i+1;j<length;j++)
			{	
				for(k=j+1;k<length;k++)
				{
					if (b[i] + b[j] + b[k] == 0)
					{
						System.out.println(b[i] + " " + b[j] + " " + b[k]);
						count++;
					}
				}
			}
		}
		return count;
	}
	/**
	 * Function is used to read the data form all file in local directory
	 * 
	 * @param fileName the location of the file from where the contents will be readed
	 * @return contents of the file
	 */
	public static String readAllFromFile(String fileName)
	{
		String line=null;
		String readedFile="";
		try 
		{
			FileReader filereader=new FileReader(fileName);
			BufferedReader bufferedReader=new BufferedReader(filereader);
			while((line=bufferedReader.readLine())!= null)
			{
				readedFile+=line;
			}
			bufferedReader.close();
		}
		catch(FileNotFoundException fileNotFoundException)
		{
			System.out.println("your file is not found in the location '"+fileName+"'");
		}
		catch(IOException ioException)
		{
			System.out.println("Error in reading your file '"+fileName+"'");
		}
		return readedFile;

	}

	/**
	 * Function is used to write a file
	 * 
	 * @param fileName which path the user provided by the user
	 * @param content string of the file user want to store in the file
	 */
	public void writeAllToFile(String fileName, String content)
	{
		try
		{
			FileWriter filewriter=new FileWriter(fileName);
			BufferedWriter bufferedwriter=new BufferedWriter(filewriter);
			bufferedwriter.write(content);
			bufferedwriter.close();
		}
		catch(FileNotFoundException fileNotFoundException)
		{
			System.out.println("your file is not found in the location '"+fileName+"'");
		}
		catch(IOException ioException)
		{
			System.out.println("Error in reading your file '"+fileName+"'");
		}
	}
	/**
	 * Function is used to check the date is valid or not
	 * 
	 * @param date is the given date
	 * @param month is the given month number
	 * @param year is the given year
	 * @return returns true if all the arguments are valid and returns false is any argument is invalid
	 */
	public static boolean isValidDate(int date, int month, int year)
	{
		if(date<1 || date >31)
		{
			return false;
		}
		if(month<1 || month>12)
		{
			return false;
		}
		if(month==2)
		{
			if(Utility.checkLeapYear(year).equals("Leap Year"))
				return (date<=29);
			else
				return (date<=28);
		}
		if(month==4 || month==6|| month==9 || month==11)
		{
			return (date<=30);
		}
		return true;
	}
	
	/**
	 * Function is used check and add ordered linked list
	 * 
	 * @param element which will be added in the linked list
	 * @param mylinkedlist 
	 */
	public static <T extends Comparable<T>> void checkAndAddForOrderedList(T element,MyLinkedList<T> mylinkedlist)
	{
		int count=0;
		for(int i=0;i<mylinkedlist.size();i++)
		{
			if(element.compareTo(mylinkedlist.get(i))>0)
			{
				count++;
				continue;
			}
			mylinkedlist.insert(count, element);
			return;
		}
		mylinkedlist.add(element);
	}

	/**
	 * Function is used to check the user enter expression is Balanced or Not
	 * 
	 * @param expression string the expression provided by the user input
	 * @return the expression is valid
	 */
	public static boolean checkForValidExpression(String expression) 
	{
		MyStack<Character> mystack=new MyStack<Character>();
		char paranthes;
		for(int i=0;i<expression.length();i++)
		{
			paranthes=expression.charAt(i);
			if(paranthes=='(' || paranthes=='{' || paranthes=='[')
			{
				mystack.push(paranthes);
			}
			else
			{
				if(mystack.isEmpty())//({})]
				{
					return false;
				}
				else
				{
					switch (paranthes)
					{
					case ')':
						if(mystack.peek().equals('('))
						{
							mystack.pop();
						}
						else
						{
							return false;
						}
						break;
					case '}':
						if(mystack.peek().equals('{'))
						{
							mystack.pop();
						}
						else
						{
							return false;
						}
						break;
					case ']':
						if(mystack.peek().equals('['))
						{
							mystack.pop();
						}
						else
						{
							return false;
						}
						break;
					}
				}
			}
		}
		return true;
	}
	/**
	 * Function is used to calculate the factorial
	 * 
	 * @param number integer provided by the user
	 * @return factorial value of number
	 */
	public static int factorial(int number)
	{
		int fact=1;
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	/**
	 * Function is used for how many Tree are generated 
	 * 
	 * @param nodes number of nodes in a Tree
	 */
	public static int numberOfBinaryTree(int nodes)
	{
		int output=0;
		output=factorial(2*nodes)/(factorial(nodes+1)*factorial(nodes));
		return output;
	}
	/**
     * @param object
     * @param filePath
     * @throws JsonGenerationException
     * @throws JsonMappingException
     * @throws IOException
     */
    public static <T> void convertJavaToJson(T object,String filePath)
    {
    	ObjectMapper mapper=new ObjectMapper();
    	ObjectWriter writer=mapper.writer(new DefaultPrettyPrinter());
    	try 
    	{
			writer.writeValue(new File(filePath),object);
		}
    	catch (JsonGenerationException e)
    	{
			
			e.printStackTrace();
		} 
    	catch (JsonMappingException e) 
    	{
			
			e.printStackTrace();
		} 
    	catch (IOException e) 
    	{
			
			e.printStackTrace();
		}
    	System.out.println("JSON written to the file");
}
    /**
     * Function is used to replace the String by using regex Expression
     * 
     * @param template String is matcher string to match the expression
     * @param regxName String is name 
     * @param firstName String is firstname
     * @return it match the pattern and then replace by firstName
     */
    public static String replaceOperation(String template,String regexName,String firstName)
    {
    	 Pattern pattern = Pattern.compile(regexName);
    	 Matcher match = pattern.matcher(template);
         return match.replaceAll(firstName);
    }
	
	/**
	 * Function is used to perform IntegerOpertion
	 * 
	 * @param num1 integer takes the value of first varible 
	 * @param num2 integer takes the value of second varible 
	 * @param num3 integer takes the value of third varible 
	 * 
	 */
	public static  void intgerOperations(int a,int b, int c) {
		int result;
		result = a + b * c;
		System.out.println(result);
		result = a * b + c;
		System.out.println(result);
		result = c + a / b;
		System.out.println(result);
		result = a % b + c;
		System.out.println(result);
	}
	/**
	 * Function is used to perform DoubleOpertion
	 * 
	 * @param a integer takes the value of first varible 
	 * @param b integer takes the value of second varible 
	 * @param c integer takes the value of third varible 
	 */
	public static void doubleOperations(double a, double b, double c) {
		double result;
		result = a + b * c;
		System.out.println(result);
		result = a * b + c;//return type
		System.out.println(result);
		result = c + a / b;
		System.out.println(result);
		result = a % b + c;
		System.out.println(result);
	}
	/**
	 * Function is used for Addtion of Two dice.
	 * 
	 * @return output sum of tow dice
	 */
	public static int sumofTwoDice()
	{
		int n=6;
		int a = 1 + (int) (Math.random() * n);
		System.out.println("Random Number 1: "+a);
        int b = 1 + (int) (Math.random() * n);
        System.out.println("Random Number 2: "+b);
        int result = a + b;

		return result;
	}
	/**
	 * Function is used to generate the random number between 0 To 1
	 * and find the average, minimum and maximum number.
	 * 
	 * @return the average of all the reamdon value 
	 */
	public static double statsRandom()
	{
		double a=Math.random();
		System.out.println("Number 1:"+a);
		double b=Math.random();
		System.out.println("Number 2:"+b);
		double c=Math.random();
		System.out.println("Number 3:"+c);
		double d=Math.random();
		System.out.println("Number 4:"+d);
		double e=Math.random();
		System.out.println("Number 5:"+e);
		
		double minimum = Math.min(a,Math.min(b, Math.min(c, Math.min(d, e))));
		System.out.println("Minumum Number"+minimum);
		double maximum = Math.max(a, Math.max(b,Math.max(c, Math.max(d, e))));
		System.out.println("Maxmimum Number"+maximum);
		double average = a + b + c + d + c / 5;
		return average;
	}
	/**
	 * Function is used for to perform Trignometric Operation
	 * 
	 * @param degree take a user input as a angle
	 */
	public static double trignometricOperation(int degree) {
		double  PI=3.14159;
		double  radians = degree*PI/180;
		double s = Math.sin(radians);
		System.out.println("sin of "+degree+" is :"+s);
		double c = Math.cos(radians);
		System.out.println("Cos of "+degree+" is :"+c);
		double r = Math.toRadians(degree);
		return r;
	}
	
	/**
	 * Function is used to find the Second Largest element in an array
	 * 
	 * @param array integer element in an array
	 * @param size integer number of element in an array
	 * @return second largest element in an array
	 */
	public static int print2Largest(int[] array,int size) {
		
		int i,first,second;
		if(size<2)
		{
			System.out.println("Invaild array");
		}
		first=second=Integer.MIN_VALUE;
		for(i=0;i<size;i++)
		{
			if(array[i]>first)
			{
				second=first;
				first=array[i];
			}
			else if (array[i] > second && array[i] != first)
			{
                second = array[i];
			}
		}
		return second;
	}
	/**
	 * Function is used to find the Second smallest element in an array
	 * 
	 * @param array integer element in an array
	 * @param size integer number of element in an array
	 * @return second largest element in an array
	 */
	public static int print2Smallest(int[] array,int size) {
		int i,first,second;
		if(size<2)
		{
			System.out.println("Invalid entry");
		}
		first=second=Integer.MAX_VALUE;
		for(i=0;i<size;i++)
		{
			if(array[i]<first)//check currrent number is smaller than first then update both first and second
			{
				second=first;
				first=array[i];
			}
			else if (array[i] < second && array[i] != first)
			{
                second = array[i];
			}
		}
		return second;
	}
	/**
	 * Function is used to find the Repeat element in an array
	 * 
	 * @param array integer element in an array
	 * @param size integer number of element in an array
	 */
	public static void repeatedNumber(int[] array,int size) {
		for(int i = 0; i < size; i++) 
		{  
            for(int j = i + 1; j < size; j++) 
            {  
                if(array[i] == array[j])  
                	System.out.println(array[j]);  
            }
		}//change the logic return the value
	}
	/**
	 * Function is used for maximum number of times number is occur 
	 * in the array
	 */
	public static void rollDie()
	{
		int input[]= {1,2,2,3,4,5};
		int n=input.length;
		 for(int i=1;i<=n;i++)
	        {
	        	int count=0;//change the program
	        	for(int j=0;j<n;j++)
	        	{
	        		if(input[j]==i)
	        		{
	        			count++;
	        		}
	        	}
	        	System.out.println(i+"  "+count);
	        }
	}
	/**
	 * @param steps
	 */
	/*public static void findNumber(int steps)
	{
		int result=1;
		int N = result;
		System.out.println("Imagine the no. between 0 to " + (N - 1));
		int min = 1;
		int max = N / 2;
		int i = 2, j = 4;

	// Checking the numbers
		for (int k = 1; k < steps; k++) {
		System.out.println("Is Your no Present Between " + (min - 1) + " to " + (max - 1) + "??\n Yes/No:");
		String st = Utility.inputString();
		if (st.equalsIgnoreCase("yes")) {
			N = N / 2;
			max = max - ((max - min + 1) / 2);
		} else {
			min = min + N / i;
			max = max + N / j;
			i = i + i;
			j = j + j;
		}
	}
	}*/
	
	/**
	 * couponGenerator method is used to generate Random number 
	 * @param n
	 * @return Array of Randomly Generated number.
	 */
	public static int[] couponGenerator(int n) {
		@SuppressWarnings("unused")
		int count = 1;
		Random rand = new Random();

		int[] randomCoup = new int[n];
		int x = 1;
		randomCoup[0] = rand.nextInt(100);
		System.out.println(randomCoup[0]);
		while (x < randomCoup.length) {
			int p = rand.nextInt(100);
			System.out.println("The random number is"+p);
			if ((x - 1) != p) {
				randomCoup[x] = p;
 				x++;
			}

			count++;
		}
		return randomCoup;
	}
	/**
	 * This method is used to Display Array Element.
	 * @param arr Integer Array
	 */
	public static void couponDisplay(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	/**
	 * @param fileName
	 * @param startLine
	 * @param endLine
	 */
	public static void showLines(String fileName, int startLine, int endLine) 
	{
		String line = null;
		int currentLineNo = 1;

		try {
				BufferedReader in = new BufferedReader (new FileReader(fileName));				
				//read to startLine
				while(currentLineNo<startLine) 
				{
					if (in.readLine()==null)
					{
						throw new IOException("File too small");
					}
					currentLineNo++;
				}		
				//read until endLine
				while(currentLineNo<=endLine) 
				{
					line = in.readLine();
					if (line==null) 
					{
						return;
					}
					//System.out.println(line);
					String str = line;
					
					String newstr = str.replaceAll("1", " ");
					
					String newstr1 = newstr.replaceAll("0", "*");
					System.out.println(newstr1);
					currentLineNo++;
					
				}
				
//				String str = line;
//				System.out.println(str);
			} 
			catch (IOException ex) 
			{
				System.out.println("Problem reading file.\n" + ex.getMessage());
			} 
	}
	/**
	 * Function is used to validate the firstName
	 * 
	 * @param firstName input provided by the user
	 * @return the pattern which is valid 
	 */
	public static boolean validateFirstName(String firstName)
	{
		return firstName.matches("[a-zA-Z]*");
	}
	/**
	 * Function is used to validate the lastname
	 * 
	 * @param lastName input provided by the user
	 * @return the pattern which is valid
	 */
	public static boolean validateLastName(String lastName)
	{
		return lastName.matches("[a-zA-Z]*");
	}
	/**
	 * Function is used to validate the email address
	 * 
	 * @param email input is provided by the user
	 * @return check the pattern of email user enter is valid or not
	 */
	public static boolean validateEmailAddress(String email)
	{
		String emailRegex="^[a-zA-z](.+)@(.+)$";
		Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches();
	}
	/**
	 * Function is used to validate the mobile Number
	 * 
	 * @param mobileNumber input is provided by the user
	 * @return check the pattern of mobileNumber user enter is valid or not
	 */
	public static boolean validatePhoneNumber(String mobileNumber)
	{
		Pattern pattern = Pattern.compile("(0/91)?[7-9][0-9]{9}");
		Matcher match=pattern.matcher(mobileNumber);
		return (match.find() &&match.group().equals(mobileNumber));
	}
	/**
	 * Function is used to validate the company name
	 * 
	 * @param companyName string provided by the userr
	 * @return check the pattern of companyName user enter is valid or not
	 */
	public static boolean validateCompanyName(String companyName)
	{
		String patter="[a-zA-z]*";
		Pattern pattern = Pattern.compile(patter);
		Matcher match=pattern.matcher(companyName);
		return pattern.matcher(companyName).matches();
	}
	/**
	 * Function is used to validate the userid
	 * 
	 * @param userId string provided by the user
	 * @return check the pattern of userId enter is valid or not
	 */
	public static boolean validateUserId(String userId)
	{
		return userId.matches("^[a-zA-Z0-9+_.-](.+)$");
	}
	/**
	 * Function is used to check validation of user password
	 * 
	 * @param password string provided by the user
	 * @return check the pattern of password user enter is valid or not
	 */
	public static boolean validatePassword(String password)
	{
		Pattern pattern = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*]).{8,20})");
		Matcher match = pattern.matcher(password);
		return pattern.matcher(password).matches();
	}
	/**
	 * Function is used to distribute the cards in players
	 * 
	 * @param cards 
	 * @param players Number of players 
	 * @return players print the players cards they have
	 */
	public static String[][] shuffle(MyLinkedList<String> cards ,String[][] players)
	{
		Random rand = new Random();
		int numberOfCardsPresent=52;
		for(int i=0;i<9;i++)
		{
			players[0][i]=cards.pop(rand.nextInt(numberOfCardsPresent--));
			players[1][i]=cards.pop(rand.nextInt(numberOfCardsPresent--));
			players[2][i]=cards.pop(rand.nextInt(numberOfCardsPresent--));
			players[3][i]=cards.pop(rand.nextInt(numberOfCardsPresent--));
		}
		return players;
	}
	/**
	 * Function is used to multiply Two matrix
	 *  
	 * @param resultArray integer array provided by the user
	 * @return 
	 */
	public static Integer[][] matrixMultplication(Integer resultArray[][])
	{
		
		int sum=0;
		System.out.println("enter number of rows and columns of the first array");
		int rows1=Utility.inputInteger();
		int columns1=Utility.inputInteger();
		System.out.println("enter elements of the first array row wise");
		Integer[][] firstArray;
		
		firstArray=new Integer[rows1][columns1];
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<columns1;j++)
			{
				firstArray[i][j]=Utility.inputInteger();
			}
		}
		System.out.println("enter number of rows and columns of the second array");
		int rows2=Utility.inputInteger();
		int columns2=Utility.inputInteger();
		System.out.println("enter elements of the second array row wise");
		Integer[][] secondArray;
		resultArray =new Integer[rows1][columns2];
		secondArray=new Integer[rows2][columns2];
		for(int i=0;i<rows2;i++)
		{
			for(int j=0;j<columns2;j++)
			{
				secondArray[i][j]=Utility.inputInteger();
			}
		}
		System.out.println("Multplication of both matrix...........");
		int i=0;
		do
		{
			int j=0;
			do
		    {
				sum=0;
		        int k= 0 ; 
				do
		  		{
		            sum +=firstArray[i][k]*secondArray[k][j];
					k++;
		        }while(k < rows2);
		         resultArray[i][j]=sum;
		         j++;
		    }while( j < columns2);
		         i++;
		}while( i < rows1 );
		return resultArray;
	}
}