package A3;
import java.util.Scanner;
public class program3b4 {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter a string to check for palindrome: ");
	        String input = scanner.nextLine();

	        // Check palindrome
	        if (isPalindrome(input)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is NOT a palindrome.");
	        }

	        scanner.close();
	    }

	    // User-defined function to check if a string is a palindrome
	    public static boolean isPalindrome(String str) {
	        if (str == null) {
	            return false;
	        }

	        // Remove non-alphanumeric characters and convert to lowercase
	        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	        // Reverse the cleaned string
	        String reversed = new StringBuilder(cleaned).reverse().toString();

	        // Compare original cleaned string with reversed
	        return cleaned.equals(reversed);
	    }
	}


