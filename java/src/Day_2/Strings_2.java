package Day_2;

public class Strings_2 {
    public static void main(String[] args){
        // A string in java is an object that represents a sequence of characters.   It belongs to : java.lang.String   And it is Immutable , Final Class , Serializable , Comparable

        // 2 Methods of Creating String
        // Method 1 - String Literal (POOL)
        String s1 = "Java";
        // Stored in String Pool . Reused if same value exists

        // Method 2 - Using new (Heap)
        String s2 = new String("Java");
        // stored in Heap . Always create new object


        // String Immutability -- Once created value cannot be changed

        String s = "Hello";
        s.concat("World");
        System.out.println(s); // Hello
        // New object created, but not stored.



        // Reference vs Value Comparison , ==  vs equals()
        String a = "Java";
        String b = "Java";
        String c = new String("Java");


        // Check      Meaning     Result
        // a == b    Memory       True
        // a == c    Memory       True
        // a.equals  Value        False


    }
}
