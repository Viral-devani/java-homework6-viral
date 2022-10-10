package homework6;

/*Write a Java program to swap two variables.*/
public class Program15 {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("Before swap numbers: ");
        System.out.println("a = " +a );
        System.out.println("b = " +b );

        int temporary = a;//temporary variable to store value of a
        a = b;//swapping value of b into a
        b = temporary;//Restoring temporary value to b

        System.out.println("\nAfrer swap numbers: ");
        System.out.println("a = " +a );
        System.out.println("b = " +b );


    }
}