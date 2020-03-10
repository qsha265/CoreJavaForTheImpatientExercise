package chapter1;

import java.util.ArrayList;

/**
 * chapter1.Exercise15
 *
 * @author Quanyu Sha
 * @date 05/03/2020
 */
public class Exercise15 {

    /* Question
    Write a program that stores Pascal's triangle up to a given n in an ArrayList<ArrayList<Integer>>.

    Pascal's triangle:
    1
    1 1
    1 2 1
    1 3 3 1
    1 4 6 4 1
    ...
    */

    public static ArrayList<ArrayList<Integer>> pascalTriangleInArrayList(int n) {
        ArrayList<ArrayList<Integer>> pascalsTriangle = new ArrayList<ArrayList<Integer>>();

        // using math formula
        for (int line = 1; line <= n; line++) {
            int c = 1;
            ArrayList<Integer> lineInts = new ArrayList<Integer>();
            for (int i = 1; i <= line; i++) {
                lineInts.add(c);
                c = c * (line - i) / i;
            }
            pascalsTriangle.add(lineInts);
        }
        return pascalsTriangle;
    }
}
