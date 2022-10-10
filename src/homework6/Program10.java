package homework6;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter one number:  ");
        int n = scanner.nextInt();
        int a = (n * 1);
        int b = (n * 2);
        int c = (n * 3);
        int d = (n * 4);
        int e = (n * 5);
        int f = (n * 6);
        int g = (n * 7);
        int h = (n * 8);
        int i = (n * 9);
        int j = (n * 10);

        System.out.println(n + " X  1 = " + a);
        System.out.println(n + " X  2 = " + b);
        System.out.println(n + " X  3 = " + c);
        System.out.println(n + " X  4 = " + d);
        System.out.println(n + " X  5 = " + e);
        System.out.println(n + " X  6 = " + f);
        System.out.println(n + " X  7 = " + g);
        System.out.println(n + " X  8 = " + h);
        System.out.println(n + " X  9 = " + i);
        System.out.println(n + " X 10 = " + j);

        scanner.close();


    }
}
