/**
 * purpose:  Writes data of various types to standard output.
 * @author:  Nikhil Mondhe
 * @version: 1.0
 * @since  : 30/11/2018
 */
package com.bridgelabz.libraries;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

public class BLStdOut {
	
	// force Unicode UTF-8 encoding; otherwise it's system dependent
    private static final String CHARSET_NAME = "UTF-8";
    private static final Locale LOCALE = Locale.US;

    
    private static PrintWriter out;	
    // this is called before invoking any methods
    static {
        try {
            out = new PrintWriter(new OutputStreamWriter(System.out, CHARSET_NAME), true);
        }
        catch (UnsupportedEncodingException e) {
            System.out.println(e);
        }
    }
    
	/**
     * Prints a character to standard output and flushes standard output.
     * 
     * @param string the character to print
     */
    public static void print(String string) {
        out.print(string);
        out.flush();
    } 
    /**
     * Prints a character to standard output and then terminates the line.
     *
     * @param string the character to print
     */
    public static void println(String string) {
        out.println(string);
    }
    /**
     * Terminates the current line by printing the line-separator string.
     */
    public static void println() {
        out.println();
    }
    /**
     * Prints a formatted string to standard output, using the specified format
     * string and arguments, and then flushes standard output
     * 
     * @param format
     * @param args
     */
    public static void printf(String format, Object... args) {
        out.printf(LOCALE, format, args);
        out.flush();
    }
}
