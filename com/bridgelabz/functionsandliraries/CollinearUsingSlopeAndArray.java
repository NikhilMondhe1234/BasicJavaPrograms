/**
 * purpose : Checks the Collinear using Area and slope. 
 * @author : Nikhil Mondhe
 * @version: 1.0
 * @since  : 30/11/2018
 */
package com.bridgelabz.functionsandliraries;

import com.bridgelabz.libraries.MathFunction;
import com.bridgelabz.utility.Utility;

public class CollinearUsingSlopeAndArray {

	public static void main(String[] args) {
		int x1,x2,y1,y2,x3,y3;
		System.out.println("Enter the value of Quadrant");
		System.out.println("x1 :");
		x1=Utility.inputInteger();
		System.out.println("x2 :");
		x2=Utility.inputInteger();
		System.out.println("x3 :");
		x3=Utility.inputInteger();
		System.out.println("y1 :");
		y1=Utility.inputInteger();
		System.out.println("y2 :");
		y2=Utility.inputInteger();
		System.out.println("y3 :");
		y3=Utility.inputInteger();
		System.out.println("x1 : "+x1+" x2 :"+x2+" x3 :"+x3+" y1 :"+y1+" y2 :"+y2+" y3 :"+y3);
		boolean collinear=MathFunction.checkCollinearUsingArea(x1, x2, y1, y2, x3, y3);
		System.out.println("Collinear using area is :"+collinear);
		boolean collinea=MathFunction.checkCollinearUsingSlope(x1, x2, y1, y2, x3, y3);
		System.out.println("Collinear using slope is :"+collinea);
	}

}
