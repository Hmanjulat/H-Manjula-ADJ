package A2;

public class program2a {
	

	    public static void main(String[] args) {

	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = "World";
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

	        // 3. String Comparison
	        String str3 = "hello";
	        System.out.println("str1 equals str3: " + str1.equals(str3));
	        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));

	        // 4. String Searching
	        System.out.println("Index of 'l' in str1: " + str1.indexOf('l'));
	        System.out.println("str1 contains 'lo': " + str1.contains("lo"));

	        // 5. Substring Operations
	        System.out.println("Substring of str2 from index 1 to 4: " + str2.substring(1, 4));

	        // 6. String Modification
	        String modifiedStr = str1.replace('l', 'x');
	        System.out.println("Modified str1: " + modifiedStr);

	        // 7. Whitespace Handling
	        String strWithSpaces = "   Trim me   ";
	        System.out.println("Original with spaces: [" + strWithSpaces + "]");
	        System.out.println("After trim(): [" + strWithSpaces.trim() + "]");

	        // 8. String Concatenation
	        String concatenated = str1 + " " + str2;
	        System.out.println("Concatenated string: " + concatenated);

	        // 9. String Splitting
	        String colors = "Red,Green,Blue";
	        String[] colorArray = colors.split(",");
	        System.out.println("Split colors:");
	        for (String color : colorArray) {
	            System.out.println(color);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Java");
	        sb.append(" Programming");
	        sb.insert(5, "is ");
	        sb.replace(5, 8, "IS");
	        System.out.println("StringBuilder result: " + sb.toString());

	        // 11. String Formatting
	        String name = "Alice";
	        int age = 25;
	        String formatted = String.format("Name: %s, Age: %d", name, age);
	        System.out.println("Formatted string: " + formatted);

	        // 12. Email Validation with contains(), startsWith(), endsWith()
	        String email = "user@example.com";
	        boolean isValid = email.contains("@") &&
	                          email.startsWith("user") &&
	                          email.endsWith(".com");

	        System.out.println("Email: " + email);
	        System.out.println("Is email valid? " + isValid);
	    }
	}


