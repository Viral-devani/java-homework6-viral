package homework6;

import java.util.Scanner;

public class Program8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width of the Triangle:  ");
        double b = scanner.nextDouble();

        System.out.println("Enter the height of the Triangle:  ");
        double h = scanner.nextDouble();
        double area =(b*h)/2;

        System.out.println("Width of Triangle is  : " +b);
        System.out.println("Height of Triangle is : "  +h);
        System.out.println("Area of Triangle is   : " +area);
        scanner.close();

    }
}