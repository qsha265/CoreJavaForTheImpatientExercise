package chapter1;

import java.util.Scanner;

/**
 * chapter1.Exercise8
 *
 * @author Quanyu Sha
 * @date 05/03/2020
 */
public class Exercise8 {

    /* Question
    Write a program that reads a string and prints all of its nonempty substrings.
    */

    public static void main(String[] args) {
        // read a string
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = input.nextLine().trim();
        printSubstrings(inputString);
    }

    public static void printSubstrings(String string) {
        System.out.printf("All the nonempty substrings of string %s are as blow:", string);
        int stringLen = string.length();
        for (int startIndex = 0; startIndex < stringLen; startIndex++) {
            for (int endIndex = startIndex + 1; endIndex < stringLen; endIndex++) {
                System.out.println(string.substring(startIndex, endIndex));
            }
        }
    }
}
