package chapter1;

import java.math.BigInteger;

/**
 * chapter1.Exercise6
 *
 * @author Quanyu Sha
 * @date 05/03/2020
 */

public class Exercise6 {

    /* Question
    Write a program that computes the factorial n! = 1 * 2 * ... * n, using BigInteger.
    Compute the factorial of 1000.
    */

    public static void main(String[] args) {
        // When n = 1000 for factorial
        int n = 1000;
        System.out.printf("The result of the factorial of %d is %d\n", n, factorial(n));
    }

    public static BigInteger factorial(int n) {
        // get factorial using BigInteger
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i < n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
