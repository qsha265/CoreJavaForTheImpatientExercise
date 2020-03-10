package chapter1;

/**
 * chapter1.Exercise9
 *
 * @author Quanyu Sha
 * @date 05/03/2020
 */
public class Exercise9 {

    /* Question
    Write a program that compare two strings using "==" and ".equals()"
    */

    public static void main(String[] args){
        String a = new String("This is a string");
        String b = new String ("This is a string");

        // compare
        System.out.printf("The reslut of \"a == b\" will be %b\n", a == b);
        System.out.printf("The reslut of \"a.equals(b)\" will be %b\n", a.equals(b));
    }
}
