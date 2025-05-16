package A3;
import java.util.Scanner;
public class program3c1 {
	

	    // User-defined function to capitalize the first letter of each word
	    public static String capitalizeWords(String input) {
	        String[] words = input.trim().split("\\s+"); // Split by whitespace
	        StringBuilder capitalized = new StringBuilder();

	        for (String word : words) {
	            if (word.length() > 0) {
	                // Capitalize first character and make the rest lowercase
	                capitalized.append(Character.toUpperCase(word.charAt(0)))
	                           .append(word.substring(1).toLowerCase())
	                           .append(" ");
	            }
	        }

	        return capitalized.toString().trim(); // Remove trailing space
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompting user for input
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Calling user-defined function
	        String result = capitalizeWords(input);

	        // Displaying the result
	        System.out.println("Capitalized string: " + result);

	        scanner.close();
	    }
	}


