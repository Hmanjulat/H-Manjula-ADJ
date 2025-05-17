package A3;
import java.util.Scanner;
public class program3c4 {
	

	    // User-defined function to check if a string is a palindrome
	    public static boolean isPalindrome(String input) {
	        // Remove non-letter characters and convert to lowercase
	        String cleaned = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

	        // Reverse the cleaned string
	        String reversed = "";
	        for (int i = cleaned.length() - 1; i >= 0; i--) {
	            reversed += cleaned.charAt(i);
	        }

	        // Check if the cleaned string equals its reverse
	        return cleaned.equals(reversed);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask user for input
	        System.out.print("Enter a string to check for palindrome: ");
	        String userInput = scanner.nextLine();

	        // Call isPalindrome and display result
	        if (isPalindrome(userInput)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }

	        scanner.close();
	    }
	}


