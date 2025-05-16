package A3;

public class program3a {
	

	    public static void main(String[] args) {

	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = "World";
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 2 in str1: " + str1.charAt(2));

	        // 3. String Comparison
	        String str3 = "hello";
	        System.out.println("str1 equals str3: " + str1.equals(str3));
	        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));

	        // 4. String Searching
	        System.out.println("str1 contains 'll': " + str1.contains("ll"));
	        System.out.println("Index of 'l' in str1: " + str1.indexOf('l'));

	        // 5. Substring Operations
	        System.out.println("Substring of str2 from index 1 to 4: " + str2.substring(1, 4));

	        // 6. String Modification
	        String modified = str1.replace('l', 'x');
	        System.out.println("Modified str1: " + modified);

	        // 7. Whitespace Handling
	        String strWithSpaces = "   AIET College   ";
	        System.out.println("Original: [" + strWithSpaces + "]");
	        System.out.println("Trimmed: [" + strWithSpaces.trim() + "]");

	        // 8. String Concatenation
	        String joined = str1.concat(" ").concat(str2);
	        System.out.println("Concatenated String: " + joined);

	        // 9. String Splitting
	        String csv = "Red,Green,Blue";
	        String[] colors = csv.split(",");
	        System.out.println("Split colors:");
	        for (String color : colors) {
	            System.out.println(color);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Java");
	        sb.append(" Programming");
	        sb.insert(5, "is ");
	        sb.replace(5, 8, "IS");
	        sb.delete(0, 5);
	        System.out.println("StringBuilder result: " + sb.toString());

	        // 11. String Formatting
	        String name = "Alice";
	        int age = 21;
	        String formatted = String.format("Name: %s | Age: %d", name, age);
	        System.out.println("Formatted Output: " + formatted);

	        // 12. Validate Email using contains(), startsWith(), endsWith()
	        String email = "student@aiet.edu";
	        boolean isValidEmail = email.contains("@") &&
	                               email.startsWith("student") &&
	                               email.endsWith(".edu");

	        System.out.println("Email: " + email);
	        System.out.println("Is email valid? " + isValidEmail);
	    }
	}


