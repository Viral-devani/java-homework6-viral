package homework6;

/*
Write a Java program to convert a decimal number to binary number.
Input Data: Input a Decimal Number : 5
 Expected Output Binary number is: 101
 */
public class Program17 {

    public static void main(String[] args) {

        int deci_num = 5;
        String bin_num;

        bin_num = Integer.toBinaryString(deci_num);//converting decimal number to binarystring

        System.out.println("Binary number is :" +bin_num);






    }
}
