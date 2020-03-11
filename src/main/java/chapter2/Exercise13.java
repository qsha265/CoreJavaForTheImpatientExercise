package chapter2;

import com.opencsv.CSVReader;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * chapter2.Exercise13
 *
 * @author Quanyu Sha
 * @date 11/03/2020
 */
public class Exercise13 {

    /*Question:
     Write a class with a main method that reads a CSV file of your choice and prints some of the content.

     The point of this exercise is not to do anything useful with CSV files, but to practice using a library
     that is delivered as a JAR file
     */

    private static final String EXAMPLE_CSV_FILE_PATH = "src/main/resources/data/exampleCSV.csv";

    public static void main(String[] args) throws Exception {

        Reader reader = Files.newBufferedReader(Paths.get(EXAMPLE_CSV_FILE_PATH).toAbsolutePath());
        CSVReader csvReader = new CSVReader(reader);
        String[] nextRecord;
        while ((nextRecord = csvReader.readNext()) != null) {
            System.out.println("OrderDate : " + nextRecord[0]);
            System.out.println("Region : " + nextRecord[1]);
            System.out.println("Rep : " + nextRecord[2]);
            System.out.println("Item : " + nextRecord[3]);
            System.out.println("Units : " + nextRecord[4]);
            System.out.println("UnitCost : " + nextRecord[5]);
            System.out.println("Total : " + nextRecord[6]);
            System.out.println("==========================================================");
        }
    }
}

