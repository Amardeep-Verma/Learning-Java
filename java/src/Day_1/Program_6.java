package Day_1;

public class Program_6 {
    public static void main(String[] args){
        // Store a binary number and print it in decimal format.
        String binary = "1011";
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal value = " + decimal);
    }
}
