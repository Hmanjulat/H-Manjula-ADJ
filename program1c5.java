package A1;
import java.util.LinkedList;
import java.util.Collections;
public class program1c5 {
	
	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> colorList = new LinkedList<>();

	        // Add some colors
	        colorList.add("Red");      // index 0
	        colorList.add("Green");    // index 1
	        colorList.add("Blue");     // index 2
	        colorList.add("Yellow");   // index 3

	        // Display original list
	        System.out.println("Original LinkedList: " + colorList);

	        // Swap the first (index 0) and third (index 2) elements
	        if (colorList.size() >= 3) {
	            Collections.swap(colorList, 0, 2);
	            System.out.println("LinkedList after swapping first and third elements: " + colorList);
	        } else {
	            System.out.println("LinkedList doesn't have enough elements to swap.");
	        }
	    }
	}


