package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class SearchAndSortedList {

	public static void main(String[] args) {
		
		// Search for binary integer
		System.out.println("Enter the numbers of elements you want in array(in binary search integer) :");
		int size=Utility.inputInteger();
		int arr[] = new int[size];
		System.out.println("Enter  "+size+"  elements in array :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Utility.inputInteger();
		}
		System.out.println("Enter the number you want to search through BinaryInteger");
		int key = Utility.inputInteger();
		System.out.println("The "+key+" is found at postion :"+intbinary(arr, key));
		
		
		//Search for binary String
		System.out.println("Enter the numbers of elements you want in array(in binary serach string) :");
		int size1=Utility.inputInteger();
		String arr1[] = new String[size1];
		System.out.println("Enter "+size1+" elements string in array :");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=Utility.inputString();
		}
		System.out.println("Enter the string you want to search through BinaryString :");
		String key1 = Utility.inputString();
		System.out.println("The "+key1+" is found at postion :"+stringbinary(arr1, key1));
		
		
		//Insertion sort for integer
		System.out.println("Enter the numbers of elements you want in array(Insertion sort for integer) :");
		int size2=Utility.inputInteger();
		int arr2[] = new int[size2];
		System.out.println("Enter "+size2+" elements in array :");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=Utility.inputInteger();
		}
		System.out.println("The sorted list is (Insertion sort for Integer) :");
		for(int i=0;i<arr2.length;i++)
		{
			insertioninteger(arr2);
			System.out.println(arr2[i]);
		}
		
		
		//Insertion sort for string
		System.out.println("Enter the numbers of elements you want in array(Insertion sort for string) :");
		int size3=Utility.inputInteger();
		String arr3[] = new String[size3];
		System.out.println("Enter "+size3+" elements as a string in an array :");
		for(int i=0;i<arr3.length;i++)
		{
			arr3[i]=Utility.inputString();
		}
		System.out.println("The sorted list is (Insertion sort for String) :");
		for(int i=0;i<arr3.length;i++)
		{
			insertionstring(arr3);
			System.out.println(arr3[i]);
		}
		
		
		//Bubble sort for integer
		System.out.println("Enter the numbers of elements you want in array(Bubble sort for integer) :");
		int size4=Utility.inputInteger();
		int arr4[] = new int[size4];
		System.out.println("Enter "+size4+" elements in array :");
		for(int i=0;i<arr4.length;i++)
		{
			arr4[i]=Utility.inputInteger();
		}
		System.out.println("The sorted list is (Bubble sort for Integer) :");
		for(int i=0;i<arr4.length;i++)
		{
			bubbleSortInteger(arr4);
			System.out.println(arr4[i]);
		}
		
		
		//Bubble sort for String
		System.out.println("Enter the number of elements you want in array(Bubble sort for String) :");
		int size5=Utility.inputInteger();
		String arr5[] = new String[size5];
		System.out.println("Enter "+size5+" elements in array as a string:");
		for(int i=0;i<arr5.length;i++)
		{
			arr5[i]=Utility.inputString();
		}
		System.out.println("The sorted list is (Bubble sort for string) :");
		for(int i=0;i<arr5.length;i++)
		{
			bubblesortString(arr5);
			System.out.println(arr5[i]);
		}
	}
	
	/**
	 * Function is used to search the number for Binary integer 
	 * 
	 * @param array provided the elments by the user
	 * @param key string we want to search
	 * @return
	 */
	public static int intbinary(int array[],int key){
			long stopTime = 0;
			long startTime = 0;
			long elapsedTime = 0;
			int low = 0;
			int high = array.length-1;
			
			startTime = System.nanoTime();
			while(low<=high)
			{
				int mid=low +(high-low)/2;
				if(array[mid]==key)
				{	
					stopTime = System.nanoTime();
					elapsedTime=stopTime-startTime;
					System.out.println("startTime= "+startTime);
					System.out.println("stopTime= "+stopTime);
					System.out.println("ElapsedTime="+elapsedTime);
					return mid;
				}
				else if(key<array[mid])
				{
					high=mid-1;
				}
				else if(key>array[mid])
				{
					low =mid+1;
				}			
			}
			stopTime = System.nanoTime();
			elapsedTime=stopTime-startTime;
			System.out.println("startTime= "+startTime);
			System.out.println("stopTime= "+stopTime);
			System.out.println("ElapsedTime="+elapsedTime);
			return -1;
		}

	/**
	 * Function is used to search a string using Binary String
	 * @param names string provided by the user
	 * @param key string which we want to search
	 * @return 
	 */
	public static int stringbinary(String[] names, String key) {
		long stopTime = 0;
		long startTime = 0;
		long elapsedTime = 0;
	    int low = 0;
	    int high  = names.length;
	 
	    while (low <= high) 
	    {	
			startTime = System.nanoTime();
			int mid=low +(high-low)/2;
	        if (names[mid].equals(key))
	        {
	        	stopTime = System.nanoTime();
				elapsedTime=stopTime-startTime;
				System.out.println("startTime= "+startTime);
				System.out.println("stopTime= "+stopTime);
				System.out.println("ElapsedTime="+elapsedTime);
	            return mid;
	        } 
	        else if (key.compareTo(names[mid]) > 0) 
	        {
	            low = mid + 1;
	        } 
	        else if(key.compareTo(names[mid])<0)
	        {
				high = mid - 1;
	        }
	    }
	    stopTime = System.nanoTime();
		elapsedTime=stopTime-startTime;
		System.out.println("startTime= "+startTime);
		System.out.println("stopTime= "+stopTime);
		System.out.println("ElapsedTime="+elapsedTime);
		return -1;
	}
	
	/**
	 * Function is used to sort the integer value by using insertion 
	 * Algorthim
	 * 
	 * @param array provided the elments by the user
	 * @return output sorted elements 
	 */
	public static int[] insertioninteger(int[] array)
	{	
		long stopTime = 0;
		long startTime = 0;
		long elapsedTime = 0;
		int n=array.length;
		startTime = System.nanoTime();
		for(int i=1;i<n;i++)
		{
			int key=array[i];
			int j=i-1;
			while(j>=0 && array[j]>key)
			{
				array[j+1]=array[j];
				j=j-1;
			}
			array[j+1]=key;
		}
		stopTime = System.nanoTime();
		elapsedTime=stopTime-startTime;
		System.out.println("startTime= "+startTime);
		System.out.println("stopTime= "+stopTime);
		System.out.println("ElapsedTime="+elapsedTime);
		return array;
	}
	
	/**
	 * Function is used to search the string using Insertion 
	 * Algorthim
	 * 
	 * @param array provided the elments by the user
	 */
	public static String[] insertionstring(String[] array)
	{
		long stopTime = 0;
		long startTime = 0;
		long elapsedTime = 0;
		int n=array.length;
		String value;
		int index;
		startTime = System.nanoTime();
		for(int a = 1; a < n; a++){
            char currentCharValue = array[a].charAt(0);
            value = array[a];
            index = a;

            if(currentCharValue == array[a - 1].charAt(0) )
            {
                while (index > 0 && array[index - 1].charAt(1) > array[index].charAt(1))
                {
                    array[index] = array[index - 1];
                    index = index - 1;
                }
            }
            else
            {
                while (index > 0 && array[index - 1].charAt(0) > currentCharValue)
                {
                    array[index] = array[index - 1];
                    index = index - 1;
                }
            }
            array[index] = value;
        }
		stopTime = System.nanoTime();
		elapsedTime=stopTime-startTime;
		System.out.println("startTime= "+startTime);
		System.out.println("stopTime= "+stopTime);
		System.out.println("ElapsedTime="+elapsedTime);
		return array;

	}
	
	/**
	 * This function is used to sort the number by using bubbleSort Algorithm
	 * 
	 * @param num integer array provided the value through user
	 */
	public static void bubbleSortInteger(int[] num) {
		long stopTime = 0;
		long startTime = 0;
		long elapsedTime = 0;
		int temp;
		int n=num.length;
		startTime = System.nanoTime();
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(num[j]>num[j+1])
				{
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		stopTime = System.nanoTime();
		elapsedTime=stopTime-startTime;
		System.out.println("startTime= "+startTime);
		System.out.println("stopTime= "+stopTime);
		System.out.println("ElapsedTime="+elapsedTime);
	}
	/**
	 * Function is used to sort the string using Bubblesort algorthim
	 * 
	 * @param str 
	 */
	public static void bubblesortString(String[] str) {
		long stopTime = 0;
		long startTime = 0;
		long elapsedTime = 0;
		String temp;
		int num=str.length;
		startTime = System.nanoTime();
		for(int i=0;i<num-1;i++)
		{
			for(int j=0;j<num-i-1;j++)
			{
				if(str[j].compareTo(str[j+1])>0)
				{
					temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
				}
			}
		}
		stopTime = System.nanoTime();
		elapsedTime=stopTime-startTime;
		System.out.println("startTime= "+startTime);
		System.out.println("stopTime= "+stopTime);
		System.out.println("ElapsedTime="+elapsedTime);
	}
}