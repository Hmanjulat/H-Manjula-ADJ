package A1;
import java.util.LinkedList;
public class program1c3 {
	
	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> colorList = new LinkedList<>();

	        // Add some initial colors
	        colorList.add("Red");
	        colorList.add("Green");
	        colorList.add("Blue");

	        // Display original list
	        System.out.println("Original LinkedList: " + colorList);

	        // Insert the specified element at the end
	        colorList.offerLast("Pink");

	        // Display updated list
	        System.out.println("LinkedList after inserting 'Pink' at the end: " + colorList);
	    }
	}

