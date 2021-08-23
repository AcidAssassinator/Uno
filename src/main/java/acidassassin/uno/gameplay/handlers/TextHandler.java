package acidassassin.uno.gameplay.handlers;

import java.util.Scanner;

public class TextHandler {
	public static final int CONSOLE_WIDTH = 75;
	static Scanner scn = new Scanner(System.in);

	public static String formatString (String str) {
		String output = "";

		// Separate words at each underscore
		String[] words = str.split("_");
		for (String word : words) {

			// Make a lowercase base
			char[] formattedChars = word.toLowerCase().toCharArray();

			// Set the first letter of the word to be capital
			formattedChars[0] = word.toUpperCase().charAt(0);

			// Add the word to the output
			output = output.concat(" " + String.valueOf(formattedChars));
		}
		// Remove the space at the front
		output = output.stripLeading();

		return output;
	}

	public static void clearConsole () {
		for (int i = 0; i < 50; i++) {
			System.out.println("");
		}
	}

	public static String getInput() {
		return scn.nextLine();
	}

	public static void println (Object obj) {
		System.out.println(obj);
	}

	public static void print (Object obj) {
		System.out.print(obj);
	}
}
