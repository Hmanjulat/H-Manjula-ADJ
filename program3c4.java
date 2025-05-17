package A3;
import java.util.Random;
import java.util.Scanner;
public class program3c4 {
	

	

	    // User-defined function to generate a random string of given length
	    public static String generateRandomString(int length) {
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        StringBuilder result = new StringBuilder();
	        Random rand = new Random();

	        for (int i = 0; i < length; i++) {
	            int index = rand.nextInt(characters.length()); // Get random index
	            result.append(characters.charAt(index));       // Append character at index
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask user for desired length of the random string
	        System.out.print("Enter the desired length of the random string: ");
	        int length = scanner.nextInt();

	        // Generate and display the random string
	        String randomString = generateRandomString(length);
	        System.out.println("Generated Random String: " + randomString);

	        scanner.close();
	    }
	}
