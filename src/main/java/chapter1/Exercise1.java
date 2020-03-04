package chapter1;

import java.util.Scanner;

/**
 * chapter1.Exercise1
 *
 * @author Quanyu Sha
 * @date 04/03/2020
 */

public class Exercise1 {

    /* Question:
    Write a program that reads an integer and prints it in binary, octal, and hexadecimal.

    Print the reciprocal as a hexadecimal floating-point number.
    */

    public static void main(String[] args) {
        // read an integer
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int inputInt = input.nextInt();

        // print in binary
        System.out.printf("Input integer in binary: %s\n", Integer.toBinaryString(inputInt));

        // print in octal
        System.out.printf("Input integer in octal: %o\n", inputInt);

        // print in hexadecimal
        System.out.printf("Input integer in hexadecimal: %x\n", inputInt);

        // print the reciprocal as hexadecimal floating-point number
        double reciprocal = 10.0 / inputInt;
        System.out.printf("Hexadecimal floating-pint number: %a\n", reciprocal);
    }
}
