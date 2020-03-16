package chapter3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalDouble;

/**
 * chapter3.Exercise1
 *
 * @author Quanyu Sha
 * @date 13/03/2020
 */
public class Exercise1 {

    /* Question
    Provide an interface Measurable with a method double getMeasure() that measures an object
    in some way. Make Employee implement Measurable. Provide a method double average(Measurable[]
    objects) that computes the average measure. Use it to compute the average salary of an array of
    employees.

    Provide a method Measurable largest(Measurable[] objects). Use it to find the name of the employee with the largest salary.
    */

    interface Measurable{
        double getMeasure();
    }

    public class Employee implements Measurable {
        private double salary;
        private String name;

        @Override
        public double getMeasure(){
            return this.salary;
        }

        public String getName() {
            return name;
        }

        public double average(Measurable[] objects){
            OptionalDouble result = Arrays.asList(objects).parallelStream().mapToDouble((object) -> object.getMeasure()).average();
            return result.getAsDouble();
        }

        public Measurable largest(Measurable[] objects){
            return Arrays.asList(objects).parallelStream().max(Comparator.comparingDouble(object -> getMeasure())).get();
        }

        public Employee(double salary, String name) {
            this.salary = salary;
            this.name = name;
        }
    }
}
