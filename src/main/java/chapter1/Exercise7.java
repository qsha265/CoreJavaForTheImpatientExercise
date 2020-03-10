package chapter1;

import java.util.Scanner;

/**
 * chapter1.Exercise7
 *
 * @author Quanyu Sha
 * @date 05/03/2020
 */
public class Exercise7 {
    private static final int MAX_LIMIT = 65535;

    /* Question
    Write a program that reads in two numbers between 0 and 65535, stores them in short variables, and computes their unsigned sum,
    difference, product, quotient, and remainder, without converting them to int.
    */

    public static void main(String[] args) {
        // read two integers and check the value
        System.out.printf("Enter two integers between 0 and %d: \n", MAX_LIMIT);
        Short firstShort = (short) checkInputScroop(getInputInt());
        Short secondShort = (short) checkInputScroop(getInputInt());

        // unsigned sum
        System.out.printf("The sum of %d and %d is %d\n",firstShort, secondShort, firstShort + secondShort);
        // difference
        System.out.printf("The difference of %d and %d is %d\n",firstShort, secondShort, firstShort - secondShort);
        // product
        System.out.printf("The product of %d and %d is %d\n",firstShort, secondShort, firstShort * secondShort);
        // quotient
        System.out.printf("The quotient of %d and %d is %d\n",firstShort, secondShort, firstShort / secondShort);
        // remainder
        System.out.printf("The remainder of %d and %d is %d\n",firstShort, secondShort, firstShort % secondShort);
    }

    public static int checkInputScroop(int inputInt) {
        if (inputInt >= 0 && inputInt <= MAX_LIMIT) {
            return inputInt;
        } else {
            System.out.printf("The integer is not between 0 and %d, please enter another one: \n", MAX_LIMIT);
            return checkInputScroop(checkInputScroop(getInputInt()));
        }
    }

    public static int getInputInt(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
