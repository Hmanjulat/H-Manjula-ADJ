package A1;
import java.util.ArrayList;
public class program1b2 {
	

	    public static void main(String[] args) {
	        // Create an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add some colors to the list
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display original list
	        System.out.println("Original list of colors: " + colors);

	        // Remove the 2nd element (index 1)
	        if (colors.size() > 1) {
	            String removedByIndex = colors.remove(1);
	            System.out.println("Removed 2nd element (index 1): " + removedByIndex);
	        }

	        // Remove the color "Blue" by value
	        boolean removedBlue = colors.remove("Blue");
	        if (removedBlue) {
	            System.out.println("Removed color 'Blue' from the list.");
	        } else {
	            System.out.println("Color 'Blue' not found in the list.");
	        }

	        // Display final list
	        System.out.println("Updated list of colors: " + colors);
	    }
	}


