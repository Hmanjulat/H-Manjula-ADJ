package A3;
import java.util.Scanner;
public class program3b1 {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get input from user
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Call the user-defined function
	        if (isNullOrEmpty(input)) {
	            System.out.println("The string is null or contains only whitespace.");
	        } else {
	            System.out.println("The string is not null and contains visible characters.");
	        }

	        scanner.close();
	    }

	    // User-defined function to check for null or empty/whitespace-only strings
	    public static boolean isNullOrEmpty(String str) {
	        return str == null || str.trim().isEmpty();
	    }
	}


