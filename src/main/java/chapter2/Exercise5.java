package chapter2;

/**
 * chapter2.Exercise5
 *
 * @author Quanyu Sha
 * @date 10/03/2020
 */
public class Exercise5 {

    /* Question
    Implement an immutable class Point that describes a point in the plane. Provide a constructor
    to set it to a specific point, a no-arg constructor to set it to the origin, and methods getX,
    getY, translate, and scale. The translate method moves the point by a given amount in x- and y-
    direction. The scale method scales both coordinates by a given factor. Implement these methods
    so that they return new points with the results.

    Add javadoc comments
    */

    /**
     * An immutable class that describes a point in the plane.
     */
    public class Point {
        private double x;
        private double y;

        /**
         *
         * @return the value of the x
         */
        public double getX() {
            return this.x;
        }

        /**
         *
         * @return the value of the x
         */
        public double getY() {
            return this.y;
        }

        /**
         * Translate the position to create a Point.
         * @param moveOnX double number for moving on x
         * @param moveOnY double number for moving on y
         * @return return a new Point after translated
         */
        public Point translate(double moveOnX, double moveOnY) {
            return new Point(this.x + moveOnX, this.y + moveOnY);
        }

        /**
         * Scale the x,y to create a Point.
         * @param scaleNumber double number for scaling for both x and y
         * @return return a new Point after scaled
         */
        public Point scale(double scaleNumber) {
            return new Point(this.x * scaleNumber, this.y * scaleNumber);
        }

        /**
         * Constructs a new Point object with its value field initialized to the given doubles.
         * @param x set up the value of x
         * @param y set up the value of y
         */
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        /**
         * Constructs a new Point object with its value field initialized to 0.0
         */
        public Point() {
        }
    }
}
