package A3;
import java.util.Scanner;
public class program3c2 {
	
	    // User-defined function to truncate the string and add ellipsis
	    public static String truncate(String input, int maxLength) {
	        // If the input string is shorter than or equal to the max length, return it as is
	        if (input.length() <= maxLength) {
	            return input;
	        }

	        // If the specified maxLength is too short to even show ellipsis
	        if (maxLength <= 3) {
	            return "...".substring(0, maxLength); // e.g., "..." or ".." or "."
	        }

	        // Truncate and append ellipsis
	        return input.substring(0, maxLength - 3) + "...";
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get input string
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Get desired maximum length
	        System.out.print("Enter maximum length: ");
	        int maxLength = scanner.nextInt();

	        // Call the truncate function
	        String result = truncate(input, maxLength);

	        // Display result
	        System.out.println("Truncated string: " + result);

	        scanner.close();
	    }
	}


