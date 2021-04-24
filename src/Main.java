import java.util.Scanner;
import java.util.Set;

// TODO - `System.err` for errors, instead of `System.out`.

public class Main {
	static String allowedCharsString = String.join("", DataStorage.allowedChars);
	static Set<String> charSet = DataStorage.charSet;
	static String[] bigText1 = DataStorage.bigText1;
	static String[] bigText2 = DataStorage.bigText2;
	static String[] bigText3 = DataStorage.bigText3;
	static String[] bigText4 = DataStorage.bigText4;
	static String[] bigText5 = DataStorage.bigText5;
	static String[] bigText6 = DataStorage.bigText6;
	
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
		
		String input = scanner.nextLine().toUpperCase();
		scanner.close();
		for(int i = 0; i < input.length(); i++) {
			String currentChar = String.valueOf(input.charAt(i)).toUpperCase();
			boolean safe = charSet.contains(currentChar);
			if(safe == false) {
				System.err.println("ERROR: The character \"" + currentChar + "\" is not valid! Please use the Latin alphabet and only the symbols on your keyboard. Check the README for details.");
				System.exit(128); // 128 is the Unix Exit Code for a bad argument. TODO: Untested
			}
		}
		output(input);
	}
	
	public static void output(String input) {
		// TODO: Optimise so I don't need **six** `for()` loops.
		for(int i = 0; i < input.length(); i++) {
			String currentChar = String.valueOf(input.charAt(i));
			int charID = allowedCharsString.indexOf(currentChar);
			System.out.print(bigText1[charID]);
		}
		System.out.print("\n");
		for(int i = 0; i < input.length(); i++) {
			String currentChar = String.valueOf(input.charAt(i));
			int charID = allowedCharsString.indexOf(currentChar);
			System.out.print(bigText2[charID]);
		}
		System.out.print("\n");
		for(int i = 0; i < input.length(); i++) {
			String currentChar = String.valueOf(input.charAt(i));
			int charID = allowedCharsString.indexOf(currentChar);
			System.out.print(bigText3[charID]);
		}
		System.out.print("\n");
		for(int i = 0; i < input.length(); i++) {
			String currentChar = String.valueOf(input.charAt(i));
			int charID = allowedCharsString.indexOf(currentChar);
			System.out.print(bigText4[charID]);
		}
		System.out.print("\n");
		for(int i = 0; i < input.length(); i++) {
			String currentChar = String.valueOf(input.charAt(i));
			int charID = allowedCharsString.indexOf(currentChar);
			System.out.print(bigText5[charID]);
		}
		System.out.print("\n");
		for(int i = 0; i < input.length(); i++) {
			String currentChar = String.valueOf(input.charAt(i));
			int charID = allowedCharsString.indexOf(currentChar);
			System.out.print(bigText6[charID]);
		}
		System.out.print("\n");
	}
}
