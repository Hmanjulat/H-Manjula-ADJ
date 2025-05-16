package A1;
import java.util.ArrayList;
import java.util.Collections;
public class program1b3 {
	

	    public static void main(String[] args) {
	        // Create an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add some colors to the list
	        colors.add("Orange");
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");

	        // Display the original list
	        System.out.println("Original list of colors: " + colors);

	        // Sort the list using Collections.sort()
	        Collections.sort(colors);

	        // Display the sorted list
	        System.out.println("Sorted list of colors: " + colors);
	    }
	}


