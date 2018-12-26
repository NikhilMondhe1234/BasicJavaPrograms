//package com.bridgelabz.functionalprogram;
package com.bridgelabz.functionalprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.bridgelabz.utility.Utility;

	public class New1 {
			public static int generateCouponNum(int number) 
			{
				Random rand = new Random();
				List<Integer> arr = new ArrayList<>(number);
				arr.add(rand.nextInt(number));
				System.out.println(arr.get(0));
				int count = 1; //number of times random number generated
				int j = 1;  //number of times distinct number generated 
				while (j < number) {
					int r = rand.nextInt(number);
					System.out.println("The number is "+r);
					//System.out.println(arr.contains(r));
					if (arr.contains(r)) {
						System.out.println("Repeated number "+arr.contains(r));
						count++;
						System.out.println("Count Repeated number is"+count);
						continue;
					} else {
						count++;
						System.out.println("Count"+count);
						arr.add(r);
						for(int i=0;i<arr.size();i++)
						{
							System.out.println(" The random is "+arr.get(i));
						}
						j++;
						System.out.println("the value of j "+j);
					}
				}
				System.out.println("count="+count);
				return count;
			}
			public static void main(String arg[])
			{
				int n=Utility.inputInteger();
				generateCouponNum(n);
			}
	}