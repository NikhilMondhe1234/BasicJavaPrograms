/**
 * purpose:  Read data of various types to standard output.
 * @author:  Nikhil Mondhe
 * @version: 1.0
 * @since  : 30/11/2018
 */
package com.bridgelabz.libraries;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BLStdIn {
    private static final Pattern EVERYTHING_PATTERN = Pattern.compile("\\A");
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\p{javaWhitespace}+");


	private static Scanner scanner;

	/**
	* Function is used to check the empty input
	* 
	* @return Returns true if standard input is empty 
	*/
	public static boolean isEmpty() {
	        return !scanner.hasNext();
	    }
	/**
     * Function used the next token from standard input, parses it as an integer, and returns the integer.
     *
     * @return the next integer on standard input
     * @throws NoSuchElementException if standard input is empty
     * @throws InputMismatchException if the next token cannot be parsed as an int
     */
    public static int readInt() {
        try {
            return scanner.nextInt();
        }
        catch (InputMismatchException e) {
            String token = scanner.next();
            throw new InputMismatchException("attempts to read an 'int' value from standard input, "
                                           + "but the next token is \"" + token + "\"");
        }
        catch (NoSuchElementException e) {
            throw new NoSuchElementException("attemps to read an 'int' value from standard input, "
                                           + "but no more tokens are available");
        }
    }
    /**
     * Function is used the next token from standard input, parses it as a double, and returns the double.
     *
     * @return the next double on standard input
     * @throws NoSuchElementException if standard input is empty
     * @throws InputMismatchException if the next token cannot be parsed as a  double
     */
    public static double readDouble() {
        try {
            return scanner.nextDouble();
        }
        catch (InputMismatchException e) {
            String token = scanner.next();
            throw new InputMismatchException("attempts to read a 'double' value from standard input, "
                                           + "but the next token is \"" + token + "\"");
        }
        catch (NoSuchElementException e) {
            throw new NoSuchElementException("attempts to read a 'double' value from standard input, "
                                           + "but no more tokens are available");
        }
    }
    /**
     * Function is used Reads the next token  and returns the  String
     *
     * @return the next  String
     * @throws NoSuchElementException if standard input is empty
     */
    public static String readString() {
        try {
            return scanner.next();
        }
        catch (NoSuchElementException e) {
            throw new NoSuchElementException("attempts to read a 'String' value from standard input, "
                                           + "but no more tokens are available");
        }
    }
    
    /**
     * Function is used read the next token from standard input, parses it as a boolean,
     * and returns the boolean.
     * 
     * @return the next boolean on standard input
     */
    public static boolean readBoolean() {
        try {
            String token = readString();
            if ("true".equalsIgnoreCase(token))  return true;
            if ("false".equalsIgnoreCase(token)) return false;
            if ("1".equals(token))               return true;
            if ("0".equals(token))               return false;
            throw new InputMismatchException("attempts to read a 'boolean' value from standard input, "
                                           + "but the next token is \"" + token + "\"");
        }
        catch (NoSuchElementException e) {
            throw new NoSuchElementException("attempts to read a 'boolean' value from standard input, "
                                           + "but no more tokens are available");
        }
    }
    /**
     * Function is true if standard input has more input
     * 
     * @return true if standard input has more input otherwise false
     */
    public static boolean hasNextChar() {
    	 boolean result = scanner.hasNext();
    	 return result;
    }
    /**
     * Function is used to read and return the character
     * 
     * @return 	the remainder of a input as a string
     */
    public static char readChar()
    {
    	String ch = scanner.next();
    	return ch.charAt(0);
    }
    /**
     * Function is true if statndar input has more input
     *  
     * @return true if standard input has more input otherwise false
     */
    public static boolean hasNextLine(){
    	boolean result = scanner.hasNext();
    	return result;
    }
    /**
     * Function is used to read and return the string
     * 
     * @return the remainder of a input as a string
     */
    public static String readLine()
    {
    	String ch=scanner.nextLine();
    	return ch;
    }
    /**
     * Reads and returns the remainder of the input, as a string.
     *
     * @return the remainder of the input, as a string
     * @throws NoSuchElementException if standard input is empty
     */
    public static String readAll() {
        if (!scanner.hasNextLine())
            return "";

        String result = scanner.useDelimiter(EVERYTHING_PATTERN).next();
        // not that important to reset delimeter, since now scanner is empty
        scanner.useDelimiter(WHITESPACE_PATTERN); // but let's do it anyway
        return result;
    }
    /**
     * Reads all remaining tokens from standard input and returns them as an array of strings.
     *
     * @return all remaining tokens on standard input, as an array of strings
     */
    public static String[] readAllStrings() {
        // we could use readAll.trim().split(), but that's not consistent
        // because trim() uses characters 0x00..0x20 as whitespace
        String[] tokens = WHITESPACE_PATTERN.split(readAll());
        if (tokens.length == 0 || tokens[0].length() > 0)
            return tokens;

        // don't include first token if it is leading whitespace
        String[] decapitokens = new String[tokens.length-1];
        for (int i = 0; i < tokens.length - 1; i++)
            decapitokens[i] = tokens[i+1];
        return decapitokens;
    }
    /**
     * Reads all remaining tokens from standard input, parses them as integers, and returns
     * them as an array of integers.
     * 
     * @return all remaining integers on standard input, as an array
     * @throws InputMismatchException if any token cannot be parsed as an {@code int}
     */
     public static int[] readAllInts() {
        String[] fields = readAllStrings();
        int[] vals = new int[fields.length];
        for (int i = 0; i < fields.length; i++)
            vals[i] = Integer.parseInt(fields[i]);
        return vals;
    }
     /**
      * Reads all remaining tokens from standard input, parses them as doubles, and returns
      * them as an array of doubles.
      * @return all remaining doubles on standard input, as an array
      * @throws InputMismatchException if any token cannot be parsed as a {@code double}
      */
     public static double[] readAllDoubles() {
         String[] fields = readAllStrings();
         double[] vals = new double[fields.length];
         for (int i = 0; i < fields.length; i++)
             vals[i] = Double.parseDouble(fields[i]);
         return vals;
     }
     /**
      * Reads all remaining lines from standard input and returns them as an array of strings.
      * @return all remaining lines on standard input, as an array of strings
      */
     public static String[] readAllLines() {
         ArrayList<String> lines = new ArrayList<String>();
         while (hasNextLine()) {
             lines.add(readLine());
         }
         return lines.toArray(new String[lines.size()]);
     }
     
    /**
     * Reads all remaining tokens, parses them as integers, and returns
     * them as an array of integers.
     *  
     * @return all remaninig integer on standard input, as an array of integer
     */
     public static int[] readInts() {
         return readAllInts();
     }
    /**
     * Read all remaining tokens, parse them as intgers, and returns
     * then as array of doubles
     * 
     * @return all remaning double on standard input, as an array of double 
     */
     public static double[] readDoubles() {
         return readAllDoubles();
     }
    /**
     * Read all remaining tokens, parse them as intgers, and returns
     * then as array of doubles
     * 
     * @return all remaning double on standard input, as an array of double 
     */    
     public static String[] readStrings() {
         return readAllStrings();
     }
}
