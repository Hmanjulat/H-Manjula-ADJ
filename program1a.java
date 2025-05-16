package A1;
import java.util.*;

public class program1a {
	    public static void main(String[] args) {
	        ArrayList<String> arrayList = new ArrayList<>();
	        LinkedList<String> linkedList = new LinkedList<>();

	        System.out.println("----- ArrayList Operations -----");
	        performOperations(arrayList);

	        System.out.println("\n----- LinkedList Operations -----");
	        performOperations(linkedList);
	    }

	    public static void performOperations(List<String> list) {
	        // 1. Adding elements
	        addElements(list);
	        System.out.println("After adding elements: " + list);

	        // 2. Add element at specific index
	        addElementAtIndex(list, 1, "Grape");
	        System.out.println("After adding 'Grape' at index 1: " + list);

	        // 3. Adding multiple elements
	        addMultipleElements(list, Arrays.asList("Mango", "Pineapple"));
	        System.out.println("After adding multiple elements: " + list);

	        // 4. Accessing elements
	        System.out.println("Element at index 2: " + accessElement(list, 2));

	        // 5. Updating elements
	        updateElement(list, 2, "Peach");
	        System.out.println("After updating index 2 to 'Peach': " + list);

	        // 6. Removing elements
	        removeElement(list, "Banana");
	        System.out.println("After removing 'Banana': " + list);

	        // 7. Searching elements
	        System.out.println("Contains 'Apple': " + searchElement(list, "Apple"));

	        // 8. List size
	        System.out.println("List size: " + list.size());

	        // 9. Iterating over list
	        System.out.print("Iterating with for-each: ");
	        iterateList(list);

	        // 10. Using Iterator
	        System.out.print("Iterating with Iterator: ");
	        useIterator(list);

	        // 11. Sorting
	        sortList(list);
	        System.out.println("After sorting: " + list);

	        // 12. Sublist
	        System.out.println("Sublist (0 to 2): " + sublist(list, 0, Math.min(2, list.size())));

	        // 13. Clearing the list
	        clearList(list);
	        System.out.println("After clearing: " + list);
	    }

	    public static void addElements(List<String> list) {
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Orange");
	    }

	    public static void addElementAtIndex(List<String> list, int index, String element) {
	        list.add(index, element);
	    }

	    public static void addMultipleElements(List<String> list, List<String> elements) {
	        list.addAll(elements);
	    }

	    public static String accessElement(List<String> list, int index) {
	        return list.get(index);
	    }

	    public static void updateElement(List<String> list, int index, String newElement) {
	        list.set(index, newElement);
	    }

	    public static void removeElement(List<String> list, String element) {
	        list.remove(element);
	    }

	    public static boolean searchElement(List<String> list, String element) {
	        return list.contains(element);
	    }

	    public static void iterateList(List<String> list) {
	        for (String item : list) {
	            System.out.print(item + " ");
	        }
	        System.out.println();
	    }

	    public static void useIterator(List<String> list) {
	        Iterator<String> iterator = list.iterator();
	        while (iterator.hasNext()) {
	            System.out.print(iterator.next() + " ");
	        }
	        System.out.println();
	    }

	    public static void sortList(List<String> list) {
	        Collections.sort(list);
	    }

	    public static List<String> sublist(List<String> list, int fromIndex, int toIndex) {
	        return list.subList(fromIndex, toIndex);
	    }

	    public static void clearList(List<String> list) {
	        list.clear();
	    }
	}


