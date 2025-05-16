package A1;
import java.util.LinkedList;
import java.util.Iterator;
public class program1c2 {
	

	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> colors = new LinkedList<>();

	        // Add some colors
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");

	        System.out.println("Original LinkedList: " + colors);

	        // Use descendingIterator to iterate in reverse order
	        Iterator<String> reverseIterator = colors.descendingIterator();

	        System.out.println("Iterating in reverse order:");
	        while (reverseIterator.hasNext()) {
	            System.out.println(reverseIterator.next());
	        }
	    }
	}


