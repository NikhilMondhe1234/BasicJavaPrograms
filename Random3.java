package com.randompractice;

import java.util.ArrayList;
import java.util.Random;

public class Random3 {
  //  static ArrayList<Integer> list = new ArrayList<Integer>();
    static ArrayList<Integer> tempList = new ArrayList<Integer>();
    static int count = 0;
    static int size = 6;
    static Random rd = new Random();
    static int randomNum;
//    public static int calcRandom()
//    {
//       
//        
//        int n = rd.nextInt(10);
//        list.add(n);
//        count++;
//        return n;
//    }
    
    public static void display()
    {
        
      System.out.println(tempList);
        
    }
    
    public static ArrayList<Integer> sort()
    {
        for (int i = 0; i < tempList.size(); i++) 
        {
               for (int j = 0; j < tempList.size() - i - 1; j++)
               {
                   if (tempList.get(j) > tempList.get(j + 1)) 
                   {
                      int temp = tempList.get(j);
                      tempList.set(j, tempList.get(j + 1));
                      tempList.set(j + 1, temp);
                   }
               }
           }
        return tempList;
    }

//    public static boolean check(ArrayList<Integer> arrayList, int randomNum)
//    {
//        for(int i=0;i<arrayList.size();i++)
//        {
//            if(arrayList.get(i).equals(randomNum))
//            {
//                return false;
//            }
//        }
//        return true;
//    }
    
    public static void generateRandom()
    {
    	randomNum = rd.nextInt(10);
        System.out.println("Random value=="+randomNum);
        tempList.add(randomNum);
        System.out.println("TempList is :"+tempList);        
        count++;
        System.out.println("TempList size ="+count);
    }
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
      
          
           generateRandom();
         while(count<8)
         {
	       if(tempList.contains(randomNum))
	       {
	            		int newRandom = rd.nextInt(randomNum);	
	            		if(!tempList.contains(newRandom))
	            		{
	            			tempList.add(newRandom);
	            		}
	            		else if(tempList.contains(newRandom))
	            		{
	            			int max = newRandom;
	            			if(max==0)
	            			{
	            				max = (tempList.indexOf(newRandom))+1;
	            				System.out.println("Updated=="+max);
	            			}
	            			int index = tempList.indexOf(newRandom)-1;
	            			int min = index;
	            			System.out.println("Max ="+max);
	            			System.out.println("Min ="+min);
	            			
	            			
	            			newRandom =(int) (Math.random()*(max-min)+min);
	            			System.out.println("Value is ="+newRandom);
	            			if(!tempList.contains(newRandom))
		            		{
		            			tempList.add(newRandom);
		            		}
	            		}
	            		System.out.println("newRandom"+newRandom);
	            		tempList = sort();
	            		System.out.println("tempList updated element=="+tempList);
	        }
	         count++;   
         } 
           
        }
    
}//class

















































//for(int j=0;j<tempList.size();j++)
//{
//	if(j==0)
//	{
//		tempList=list;
//		tempList = sort();
//		System.out.println("tempList element=="+tempList);
//		
//		}
//	else if((tempList.get(j))==randomNum)
//	{
//		int max = list.get(j);
//		int min = list.get(0);
//		int value = max-min;
//		System.out.println("Max value"+max);
//		System.out.println("Min value"+min);
//		System.out.println("value"+value);
//		if(value==0)
//		{
//			max=list.get(j);
//			min=list.get(j+1);
//			System.out.println("Max value"+max);
//			System.out.println("Min value"+min);
//		}
//		int newRandom = rd.nextInt(value);
//		
//		tempList.add(newRandom);
//		System.out.println("newRandom"+newRandom);
//		System.out.println("tempList updated element=="+tempList);
//		
//	}
//	else if(j>0)
//    {  
//      if(check(tempList,randomNum)==false)
//      {
//           System.out.println("inside if");
//            	
//                tempList.add(randomNum);
//                System.out.println("TempList is =="+tempList); 
//                tempList = sort();
//                System.out.println("Updated in randomn =="+tempList);
//      }
//    
//             //else
//            // {
//        	//         System.out.println("Repeated"+randomNum);
//             //}
//            //int min=list.get(0);
//            //int max = list.
//            //int newRandom = Math.random()
//        
//    }
