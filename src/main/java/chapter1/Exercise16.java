package chapter1;

/**
 * chapter1.Exercise16
 *
 * @author Quanyu Sha
 * @date 05/03/2020
 */

public class Exercise16 {

    /* Question
    Improve the average method so that it is called with at least one parameter.
    */

    /** original average method */
    public static double average(double... values) {
        double sum = 0;
        for (double v : values) {
            sum += v;
        }
        return values.length == 0 ? 0 : sum / values.length;
    }

    /** new average method */
    public static double newAverage(double valueOne, double... values) {
        double sum = valueOne;
        for (double v : values) {
            sum += v;
        }
        return sum / (values.length + 1);
    }
}
