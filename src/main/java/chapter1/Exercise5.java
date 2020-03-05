package chapter1;

/**
 * chapter1.Exercise5
 *
 * @author Quanyu Sha
 * @date 05/03/2020
 */

public class Exercise5 {

    /* Question
    What happens when you cast a double to an int that is larger than the largest possible int value?
    */

    public static void main(String[] args) {
        // check the largest possible int value
        System.out.printf("The largest possible int value is %d\n", Integer.MAX_VALUE);

        // check the result of max integer plus 1.0
        double d1 = 1.0 + Integer.MAX_VALUE;
        System.out.printf("When cast the double which is %f larger than largest integer and cast to int, the result is %d\n",
                1.0, (int) d1);

        // check the result of max integer plus 99999.999
        double d2 = 99999.999 + Integer.MAX_VALUE;
        System.out.printf("When cast the double which is %f larger than largest integer and cast to int, the result is %d\n",
                99999.999, (int) d2);
    }
}
