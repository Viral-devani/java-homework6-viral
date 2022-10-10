package homework6;
/*Write a Java program to print the area and perimeter of a rectangle.
Test Data: Width = 5.5 Height = 8.5
 Expected Output: Area is 5.6 * 8.5 = 47.60 Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
import java.text.DecimalFormat;

public class Program14
{

    public static void main(String[] args)
    {
        DecimalFormat df = new DecimalFormat("0.00");//decimal format to use only two decimals

        double width = 5.6;
        double height = 8.5;

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Are is " + width + " * " + height + " = " + df.format(area) + " Perimeter is 2 *(" + width + " +" + height + ") = " + df.format(perimeter));

    }

}