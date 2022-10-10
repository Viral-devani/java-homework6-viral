package homework6;

/*Write a Java program to add two binary numbers.
 Input Data: Input first binary number: 10
  Input second binary number: 11
   Expected Output: Sum of two binary numbers: 101
 */

public class Program16 {
    public static void main(String[] args) {

        String num1 = "10";
        String num2 = "11";
        String sum;


        int a1 = Integer.parseInt(num1, 2);//converting binary string to binary number using java API
        int a2 = Integer.parseInt(num2, 2);//converting binary string to binary number using java API
        int total = a1 + a2;//performing sum of two binary numbers
        sum = Integer.toBinaryString(total);//converting binary number to binary string using java API

        System.out.println("sum of two binary numbers: " + sum);

    }
    }

