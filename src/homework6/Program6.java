package homework6;

import java.util.Scanner;

public class Program6 {

    public static void main(String[] args) {
        double PI = 3.14, area;
        int r;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius value of the circle");
        r = scanner.nextInt();

        area = (r * r) * PI;

        System.out.println("Area of the circle is: "+area);
        scanner.close();
    }

}
