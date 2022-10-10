package homework6;

/*
Write a Java program to convert a given string into lowercase.
Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
Output: the quick brown fox jumps over the lazy dog.
 */

import java.util.*;

public class Program19 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter String in UPPERCASE (THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG ):");

        String line = s1.nextLine();
        line = line.toLowerCase();
        System.out.println(line);

        s1.close();

    }
}
