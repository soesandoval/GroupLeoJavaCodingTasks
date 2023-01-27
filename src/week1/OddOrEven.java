package week1;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if (num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");


    }
}
/*
Numbers
Write a method which can identifies given number is Odd or Even
Ex:
identify(5) -> "Odd"
identify(6) -> "Even"
 */
