package com.bridgelabz.stringandarray;
import com.bridgelabz.utility.Utility;

public class Lyrics {
	public static void main(String arg[])
	{
		System.out.println("Enter your animal name");
		String animalName=Utility.inputString1();
		System.out.println("Enter your animal sound");
		String sound=Utility.inputString1();
		String template="old MacDonald had a farm E-I-E-I-O."
						+"And on his farm he had some %ANIMAL%,"
						+ "E-I-E-I-O"
						+ "With a %SOUND%,%SOUND% here,"
						+ "And a %SOUND%,%SOUND% there,"
						+ "Here a %SOUND%,there a %SOUND%,"
						+ "Everywhere a %SOUND%,%SOUND%";
		String regexName="%ANIMAL%";
		String regexSound="%SOUND%";
		template=Utility.replaceOperation(template,regexName,animalName);
		template=Utility.replaceOperation(template,regexSound,sound);
		System.out.println(template);
	}
}