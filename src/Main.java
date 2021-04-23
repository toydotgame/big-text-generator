import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

// TODO - `System.err` for errors, instead of `System.out`.

public class Main {
	public static void main(String[] args) {
		String[] allowedChars = {"a", "b", "c"};
		Set<String> charSet = new HashSet<>(Arrays.asList(allowedChars));
		
		System.out.println("╔════╗ ╔═══╗╔═════╗   ╔═══════╗╔═════╗╔══╗╔══╗╔═══════╗\n"
						 + "║ ╔╗ ║ ╚╗ ╔╝║ ╔═╗ ║   ║ ╔╗ ╔╗ ║║ ╔═══╝╚╗ ╚╝ ╔╝║ ╔╗ ╔╗ ║\n"
						 + "║ ╚╝ ╚╗ ║ ║ ║ ║ ╚═╝   ╚═╝║ ║╚═╝║ ╚══╗  ╚╗  ╔╝ ╚═╝║ ║╚═╝\n"
						 + "║ ╔═╗ ║ ║ ║ ║ ║╔══╗      ║ ║   ║ ╔══╝  ╔╝  ╚╗    ║ ║   \n"
						 + "║ ╚═╝ ║╔╝ ╚╗║ ╚╝  ║      ║ ║   ║ ╚═══╗╔╝ ╔╗ ╚╗   ║ ║   \n"
						 + "╚═════╝╚═══╝╚═════╝      ╚═╝   ╚═════╝╚══╝╚══╝   ╚═╝   ");
		System.out.println("Please enter your input text.");
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		scanner.close();
		for(int i = 1; i <= input.length(); i++) {
			boolean safe = charSet.contains(String.valueOf(input.charAt(i - 1)));
			System.out.println("Char at position " + String.valueOf(i) + " is: " + input.charAt(i - 1) + ". Safe?: " + String.valueOf(safe));
		}
	}
}
