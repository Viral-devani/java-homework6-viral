package homework6;

/*Write a program for a calculator with addition, subtraction, multiplication and division methods
 all with parameters and use string concatenation methods.(Note: Two static and Two instance methods.)
 */

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {

        Program5 obj = new Program5();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter your second number");
        int b = scanner.nextInt();

        obj.addition(a,b);
        obj.subtraction(a,b);
        multiplication(a,b);
        divison(a,b);

        scanner.close();
    }

    public void addition(int a, int b) {
        int a1 = a + b;
        System.out.println("Addition of these numbers : " + a1);

    }

    public void subtraction(int a,int b) {

        int s1= a - b;
        System.out.println("Subtraction of these numbers : " +s1);

    }
    public static void multiplication(int a,int b){
        int m1 = a * b;
        System.out.println("Multiplication of these numbers : " +m1);
    }
    public static void divison(int a, int b){
        int d1 = a/b;
        System.out.println("Divison of these numbers : " +d1);
    }

}
