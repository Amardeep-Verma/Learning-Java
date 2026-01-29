package Day_1;

public class Program_3 {
    public static void main(String[] args){
        // Swap two numbers without using a third variable.
        int a = 2 , b =3;
        System.out.println("A = " + a + " B = " + b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("A = " + a + " B = " + b);
    }
}
