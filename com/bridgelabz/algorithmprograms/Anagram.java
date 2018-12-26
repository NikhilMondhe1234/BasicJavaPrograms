/**
 * purpose : 
 * author:
 * date:
 * version: 
 * 
 */

package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

	public class Anagram {

		public static void main(String[] args) {
			String str1;
	        String str2;
	        System.out.print("Enter First String : ");
	        str1 = Utility.inputString();
	        System.out.print("Enter Second String : ");
	        str2 = Utility.inputString();
	        Utility.checkAnagram(str1,str2);
		}
	}
