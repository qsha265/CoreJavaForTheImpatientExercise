package chapter2;

/**
 * chapter2.Exercise6
 *
 * @author Quanyu Sha
 * @date 10/03/2020
 */
public class Exercise6 {

    /* Question
    Repeat the preceding exercise, but now make translate and scale into mutable method.

    Add javadoc comments
    */

    /**
     * A mutable class that describes a point in the plane.
     */
    public class Point {
        private double x;
        private double y;

        /**
         * get value of x
         *
         * @return the value of the x
         */
        public double getX() {
            return this.x;
        }

        /**
         * get value of y
         *
         * @return the value of the x
         */
        public double getY() {
            return this.y;
        }

        /**
         * Translate the position of this point without creating a new Point.
         *
         * @param moveOnX double number for moving on x
         * @param moveOnY double number for moving on y
         */
        public void translate(double moveOnX, double moveOnY) {
            this.x += moveOnX;
            this.y += moveOnY;
        }

        /**
         * Scale the point without creating a new Point
         *
         * @param scaleNumber double number for scaling for both x and y
         */
        public void scale(double scaleNumber) {
            this.x *= scaleNumber;
            this.y *= scaleNumber;
        }

        /**
         * Constructs a new Point object with its value field initialized to the given doubles.
         *
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
