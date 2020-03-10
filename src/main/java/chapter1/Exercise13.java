package chapter1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * chapter1.Exercise13
 *
 * @author Quanyu Sha
 * @date 05/03/2020
 */
public class Exercise13 {

    /* Question
    Write a program that prints a lottery combination, picking six distinct numbers between 1 .. 49.
    */

    public static void main(String[] args) {
        // set up size
        final int lotterySize = 49;
        // create the array list for all numbers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= lotterySize; i ++){
            numbers.add(i);
        }
        // mix the numbers and select 6 of them
        Collections.shuffle(numbers);
        for (int i = 0; i < 6; i ++){
            System.out.println(numbers.get(i));
        }
    }
}
