package chapter1;

/**
 * chapter1.Exercise4
 *
 * @author Quanyu Sha
 * @date 04/03/2020
 */
public class Exercise4 {

    /* Question
    Write a program that prints the smallest and largest positive double value.
    */

    public static void main(String[] args) {
        System.out.printf("The smallest positive double value is %f, and the largest positive double value is %f",
                Math.nextUp(0.0), Math.nextDown(Double.POSITIVE_INFINITY));
    }
}
