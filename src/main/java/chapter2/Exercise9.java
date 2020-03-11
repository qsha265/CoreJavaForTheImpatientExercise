package chapter2;

/**
 * chapter2.Exercise9
 *
 * @author Quanyu Sha
 * @date 11/03/2020
 */
public class Exercise9 {

    /*Question:
     Implement a class Car that models a car traveling along the x-axis, consuming gas as it moves.
     Provide methods to drive by a given number of miles, to add a given number of gallons to the
     gas tank, and to get the current distance from the origin and fuel level. Specify the fuel
     efficiency (in miles / gallons) in the constructor.
     */

    public class Car {
        private final double efficiencyMPG;
        private double distance;
        private double fuelLevel;

        public double getFuelLevel() {
            return fuelLevel;
        }

        public double getDistance() {
            return distance;
        }

        public double numberOfFuelNeeded(double miles) {
            return (miles / this.efficiencyMPG);
        }

        public void refuel(double gallons) {
            this.fuelLevel += gallons;
        }

        public void drive(double miles) {
            double fuelNedded = numberOfFuelNeeded(miles);
            if (fuelNedded > this.fuelLevel) {
                String message = String.format("Insufficient fuel for this journey.\n" +
                                "To drive for %f miles you have to have %f gallons fuel, but you only have %f gallons",
                        miles, fuelNedded, this.fuelLevel);
                throw new IllegalArgumentException(message);
            } else {
                this.distance += miles;
                this.fuelLevel -= numberOfFuelNeeded(miles);
            }
        }

        public Car(double efficiencyMpg) {
            this.efficiencyMPG = efficiencyMpg;
        }
    }
}
