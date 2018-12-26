/**
 * purpose : Test the write funtion of standard output
 * @author : Nikhil Mondhe
 * @version: 1.0
 * @since  : 30/11/2018
 */
package com.bridgelabz.functionsandliraries;

import com.bridgelabz.libraries.BLStdOut;

public class BLStdOutput {
	public static void main(String arg[])
	{
		BLStdOut.print("Test");
		BLStdOut.println("Test");
		BLStdOut.println();
		BLStdOut.printf("",1.0/7.0);
	}

}
