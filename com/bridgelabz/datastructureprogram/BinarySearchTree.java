package com.bridgelabz.datastructureprogram;

import com.bridgelabz.utility.Utility;

public class BinarySearchTree {
		public static void main(String[] args) {
			//Take the user input the cases user want
			System.out.println("enter the number of test cases");
			int testCase=Utility.inputInteger();
			int index=0;
			int[] nodesArray=new int[testCase];
			int[] resultArray=new int[testCase];
			for(int i=0;i<testCase;i++)
			{
				//How many nodes the binary tree should generted
				System.out.println("enter the number of nodes");
				nodesArray[index]=Utility.inputInteger();
				//Method is used to how many binary tree while be generted
				resultArray[index]=Utility.numberOfBinaryTree(nodesArray[i]);
				System.out.println("Using "+nodesArray[index]+" nodes "+resultArray[index]+" \"Binary Search Tree\" can be created.");
				index++;
			}
		}
	}