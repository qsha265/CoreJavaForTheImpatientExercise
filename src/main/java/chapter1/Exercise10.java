package chapter1;

import java.util.Random;

/**
 * chapter1.Exercise10
 *
 * @author Quanyu Sha
 * @date 05/03/2020
 */

public class Exercise10 {

    /* Question
    Write a program that produces a random string of letters and digits
    by generating a random long value and printing it in base 36.
    */

    public static void main(String[] args) {
        // get random long
        Random randomString = new Random();
        long value = randomString.nextLong();
        // print long in base 36
        System.out.printf("The value of the long in base 36 is %s\n", Long.toString(value, 36));
    }
}
