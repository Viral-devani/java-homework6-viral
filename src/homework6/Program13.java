package homework6;
/*
Write a Java program that takes three numbers as input to calculate and print the average of the numbers
 */
import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter the first number:  ");
        double a = s1.nextDouble();

        System.out.print("Enter the second number: ");
        double b = s1.nextDouble();

        System.out.print("Enter the third number:  ");
        double c = s1.nextDouble();

        System.out.println("The avarage of the numbers is :  " + average(a, b, c) + "\n");

        s1.close();

    }

    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;


    }
}
