package A1;
import java.util.ArrayList;
import java.util.List;
public class program1b4 {
	

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

	        // Extract 1st and 2nd elements using subList (indices 0 to 2)
	        if (colors.size() >= 2) {
	            List<String> subColors = colors.subList(0, 2); // Extracts index 0 and 1
	            System.out.println("Sublist (1st and 2nd elements): " + subColors);
	        } else {
	            System.out.println("Not enough elements in the list to extract a sublist.");
	        }
	    }
	}


