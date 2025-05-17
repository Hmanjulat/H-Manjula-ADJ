package A3;
import java.util.Scanner;
public class program3c5 {
	
	    // User-defined function to count words in a string
	    public static int countWords(String input) {
	        // Trim the string to remove leading and trailing spaces
	        input = input.trim();

	        // If the string is empty after trimming, return 0
	        if (input.isEmpty()) {
	            return 0;
	        }

	        // Split the string using one or more whitespace characters
	        String[] words = input.split("\\s+");

	        // Return the number of words
	        return words.length;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask user for input string
	        System.out.print("Enter a string: ");
	        String userInput = scanner.nextLine();

	        // Call countWords() and display the result
	        int wordCount = countWords(userInput);
	        System.out.println("Number of words in the string: " + wordCount);

	        scanner.close();
	    }
	}

