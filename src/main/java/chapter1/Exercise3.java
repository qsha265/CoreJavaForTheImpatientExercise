package chapter1;

import java.util.Scanner;

/**
 * chapter1.Exercise3
 *
 * @author Quanyu Sha
 * @date 04/03/2020
 */

public class Exercise3 {

    /* Question
    Using only the conditional operator, write a program that reads three integers and prints the largest.

    Repeat with Math.max.
    */

    public static void main(String[] args) {
        // read three integers
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int firstInt = input.nextInt();
        int secondInt = input.nextInt();
        int thirdInt = input.nextInt();

        // using only the conditional operator
        System.out.printf("The largest integer is %d by using only the conditional operator\n",
                firstInt >= secondInt ? (firstInt >= thirdInt ? firstInt : thirdInt) : (secondInt >= thirdInt ? secondInt : thirdInt));

        // using Math.max
        System.out.printf("The largest integer is %d by using Math.max\n",
                Math.max(Math.max(firstInt, secondInt), thirdInt));
    }
}
