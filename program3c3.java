package A3;
import java.util.Scanner;
public class program3c3 {
	

	    // User-defined function to check if a string is numeric
	    public static boolean isNumeric(String input) {
	        // Return false if the string is empty or null
	        if (input == null || input.isEmpty()) {
	            return false;
	        }

	        // Check each character to ensure it is a digit
	        for (int i = 0; i < input.length(); i++) {
	            if (!Character.isDigit(input.charAt(i))) {
	                return false;
	            }
	        }

	        return true; // All characters are digits
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask the user for input
	        System.out.print("Enter a string to check if it's numeric: ");
	        String userInput = scanner.nextLine();

	        // Call the isNumeric() function and display result
	        if (isNumeric(userInput)) {
	            System.out.println("The string contains only numeric characters.");
	        } else {
	            System.out.println("The string does not contain only numeric characters.");
	        }

	        scanner.close();
	    }
	}


	   


