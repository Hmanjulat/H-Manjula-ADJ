package A3;
import java.util.Scanner;
public class program3c3 {
	

	    // User-defined function to reverse a string
	    public static String reverseString(String input) {
	        String reversed = "";
	        for (int i = input.length() - 1; i >= 0; i--) {
	            reversed += input.charAt(i);  // Append characters in reverse order
	        }
	        return reversed;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask the user for input
	        System.out.print("Enter a string to reverse: ");
	        String userInput = scanner.nextLine();

	        // Call the reverseString() function
	        String reversedOutput = reverseString(userInput);

	        // Print the reversed string
	        System.out.println("Reversed string: " + reversedOutput);

	        scanner.close();
	    }
	}


