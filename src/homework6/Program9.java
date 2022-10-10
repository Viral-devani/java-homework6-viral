package homework6;

import java.util.Scanner;

//Write a program to convert the upper case to lower case
public class Program9 {

    public static void main(String[] args) {
        String upper;
        Scanner sc = new Scanner(System.in);

        System.out.println("UPPERCASE TO lowercase = ");
        upper = sc.nextLine();

        String upstring = upper.toLowerCase();//built - in function
        System.out.println("The lowercase string = " + upstring);

        sc.close();


    }
}
