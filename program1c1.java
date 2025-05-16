package A1;
import java.util.LinkedList;
import java.util.ListIterator;
public class program1c1 {
	

	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> colors = new LinkedList<>();

	        // Add some colors
	        colors.add("Red");      // index 0
	        colors.add("Green");    // index 1 (2nd element)
	        colors.add("Blue");     // index 2
	        colors.add("Yellow");   // index 3
	        colors.add("Orange");   // index 4

	        System.out.println("Original LinkedList: " + colors);

	        // Create a ListIterator starting at index 1 (2nd element)
	        ListIterator<String> iterator = colors.listIterator(1);

	        System.out.println("Iterating from 2nd element onwards:");

	        // Iterate from 2nd element to the end
	        while (iterator.hasNext()) {
	            String color = iterator.next();
	            System.out.println(color);
	        }
	    }
	}


