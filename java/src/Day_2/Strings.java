package Day_2;

public class Strings {
    public static void main(String[] args){


        // String creation method

        String s1 = "Hello";                         // String Literal
        String s2 = new String("Hello");      // Using constructor

        // String pool vs Heap
        // String pool stores reusable string literals to save memory, while Heap stores all objects including strings created using the new keyword , allowing duplicate objects

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1== str2); // true (same reference in pool)
        System.out.println(str1== str3); // false (different objects)
        System.out.println(str1.equals(str3)); // true (same content)


        // String Immutability   -- > A String in Java is immutable , meaning once it is created , its value cannot be changed. If you try to modify a string, Java creates a new object instead of changing the old one.

        String name = "John";
        name.toUpperCase();
        System.out.println(name);  // still prints john

        // correct way
        name = name.toUpperCase(); // Creates new string
        System.out.println(name);


        // Common String Operations
        String text = "Hello World";
        // Length
        System.out.println(text.length());
        // Accessing Characters
        System.out.println(text.charAt(0));
        // Substring
        System.out.println(text.substring(0,5));
        // Contains , startsWith , endsWith
        System.out.println(text.contains("World"));
        // Replace
        String newText = text.replace("World","Java");
        System.out.println(newText);
    }
}
