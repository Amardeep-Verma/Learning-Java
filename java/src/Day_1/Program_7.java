package Day_1;

public class Program_7 {
    public static void main(String[] args){
        // Find the largest of 3 numbers using only ternary operator
        int a = 25;
        int b = 40;
        int c = 30;

        int largest = (a>b)?(a>c ? a:c) : (b>c ? b : c);
        System.out.println("Largest number = " + largest);
    }
}
