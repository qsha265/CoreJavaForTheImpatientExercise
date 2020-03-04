package chapter1;

import java.util.Scanner;

/**
 * chapter1.Exercise2
 *
 * @author Quanyu Sha
 * @date 04/03/2020
 */

public class Exercise2 {

    /* Question
    Write a program that reads an integer angle ( which may be positive or negative)
    and normalizes it to a value between 0 and 359 degrees.

    Try it first with the % operator, then with floorMod.
     */

    public static void main(String[] args) {
        // read an integer
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer angle (can be both positive or negative): ");
        int inputAngle = input.nextInt();

        // Normalizes it to a value between 0 and 359 degrees
        System.out.printf("The result with %% will be %d\n", Math.abs(inputAngle % 360));
        System.out.printf("The result with floorMod will be %d\n", Math.floorMod(inputAngle, 360));
    }
}
