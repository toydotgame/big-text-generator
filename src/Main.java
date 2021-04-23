import java.util.Scanner;
import java.util.Set;

// TODO - `System.err` for errors, instead of `System.out`.

/* 
 * TODO - Charset, seperated into a String[] per line.
 * 
 * ╔═══╗╔══╗ ╔═══╗╔═══╗╔═══╗╔═══╗╔═══╗╔╗ ╔╗╔══╗  ╔╗╔╗╔═╗╔╗   ╔═╗╔═╗╔═╗ ╔╗╔═══╗╔═══╗╔═══╗╔═══╗╔═══╗╔════╗╔╗ ╔╗╔╗  ╔╗╔╗  ╔╗  ╔╗╔═╗╔═╗╔╗  ╔╗╔════╗
 * ║╔═╗║║╔╗║ ║╔═╗║╚╗╔╗║║╔══╝║╔══╝║╔═╗║║║ ║║╚╗╔╝  ║║║║║╔╝║║   ║ ╚╝ ║║ ╚╗║║║╔═╗║║╔═╗║║╔═╗║║╔═╗║║╔══╝║╔╗╔╗║║║ ║║║╚╗╔╝║║╚╗╔╝╚╗╔╝║╚╗╚╝╔╝║╚╗╔╝║╚══╗ ║
 * ║║ ║║║╚╝╚╗║║ ╚╝ ║║║║║╚══╗║╚══╗║║ ╚╝║╚═╝║ ║║   ║║║╠╩╝ ║║   ║╔╗╔╗║║╔╗╚╝║║║ ║║║╚═╝║║║ ║║║╚═╝║║╚══╗╚╝║║╚╝║║ ║║╚╗║║╔╝╚╗║║  ║║╔╝ ╚╗╔╝ ╚╗╚╝╔╝  ╔╝╔╝
 * ║╚═╝║║╔═╗║║║ ╔╗ ║║║║║╔══╝║╔══╝║║╔═╗║╔═╗║ ║║ ╔╗║║║╠╦╗ ║║ ╔╗║║║║║║║║╚╗ ║║║ ║║║╔══╝║╚═╝║║╔╗╔╝╚══╗║  ║║  ║║ ║║ ║╚╝║  ║╚╝╔╗╚╝║  ╔╝╚╗  ╚╗╔╝  ╔╝╔╝ 
 * ║╔═╗║║╚═╝║║╚═╝║╔╝╚╝║║╚══╗║║   ║╚╝ ║║║ ║║╔╝╚╗║╚╝║║║║╚╗║╚═╝║║║║║║║║║ ║ ║║╚═╝║║║   ╚══╗║║║║╚╗╔══╝║  ║║  ║╚═╝║ ╚╗╔╝  ╚╗╔╝╚╗╔╝ ╔╝╔╗╚╗  ║║  ╔╝ ╚═╗
 * ╚╝ ╚╝╚═══╝╚═══╝╚═══╝╚═══╝╚╝   ╚═══╝╚╝ ╚╝╚══╝╚══╝╚╝╚═╝╚═══╝╚╝╚╝╚╝╚╝ ╚═╝╚═══╝╚╝      ╚╝╚╝╚═╝╚═══╝  ╚╝  ╚═══╝  ╚╝    ╚╝  ╚╝  ╚═╝╚═╝  ╚╝  ╚════╝
 * ╔═══╗ ╔╗ ╔═══╗╔═══╗╔╗ ╔╗╔═══╗╔═══╗╔═══╗╔═══╗╔═══╗
 * ║╔═╗║╔╝║ ║╔═╗║║╔═╗║║║ ║║║╔══╝║╔══╝║╔═╗║║╔═╗║║╔═╗║
 * ║║║║║╚╗║ ╚╝╔╝║╚╝╔╝║║╚═╝║║╚══╗║╚══╗╚╝╔╝║║╚═╝║║╚═╝║
 * ║║║║║ ║║ ╔═╝╔╝╔╗╚╗║╚══╗║╚══╗║║╔═╗║  ║╔╝║╔═╗║╚══╗║
 * ║╚═╝║╔╝╚╗║ ╚═╗║╚═╝║   ║║╔══╝║║╚═╝║  ║║ ║╚═╝║╔══╝║
 * ╚═══╝╚══╝╚═══╝╚═══╝   ╚╝╚═══╝╚═══╝  ╚╝ ╚═══╝╚═══╝
 * 
 * ╔═╗      ╔═════╗
 * ║ ║      ║ ╔═╗ ║
 * ║ ║      ╚═╝ ║ ║
 * ╚═╝╔═╗       ╚═╝
 * ╔═╗╚╗║╔═╗    ╔═╗
 * ╚═╝ ╚╝╚═╝    ╚═╝
 */

public class Main {
	static Set<String> charSet = DataStorage.charSet;	
	
	public static void main(String[] args) {
		System.out.println("╔════╗ ╔═══╗╔═════╗   ╔═══════╗╔═════╗╔══╗╔══╗╔═══════╗\n"
						 + "║ ╔╗ ║ ╚╗ ╔╝║ ╔═╗ ║   ║ ╔╗ ╔╗ ║║ ╔═══╝╚╗ ╚╝ ╔╝║ ╔╗ ╔╗ ║\n"
						 + "║ ╚╝ ╚╗ ║ ║ ║ ║ ╚═╝   ╚═╝║ ║╚═╝║ ╚══╗  ╚╗  ╔╝ ╚═╝║ ║╚═╝\n"
						 + "║ ╔═╗ ║ ║ ║ ║ ║╔══╗      ║ ║   ║ ╔══╝  ╔╝  ╚╗    ║ ║   \n"
						 + "║ ╚═╝ ║╔╝ ╚╗║ ╚╝  ║      ║ ║   ║ ╚═══╗╔╝ ╔╗ ╚╗   ║ ║   \n"
						 + "╚═════╝╚═══╝╚═════╝      ╚═╝   ╚═════╝╚══╝╚══╝   ╚═╝   JAVA EDITION\n"
						 + "A Java port of Redo122's Big-Text-Generator. By toydotgame, 2021.\n");
		System.out.println("Please enter your input text:");
		System.out.print("> ");
		Scanner scanner = new Scanner(System.in); // Initialises user input, after the prompt.
		
		String input = scanner.nextLine();
		for(int i = 0; i < input.length(); i++) {
			String currentChar = String.valueOf(input.charAt(i)).toUpperCase();
			boolean safe = charSet.contains(currentChar);
			if(safe == false) {
				System.err.println("ERROR: The character \"" + currentChar + "\" is not valid! Please use the Latin alphabet and only the symbols on your keyboard. Check the README for details.");
				System.exit(128); // 128 is the Unix Exit Code for a bad argument. TODO: Untested
			}
		}
		System.out.println("Success.");
		scanner.close();
	}
}
