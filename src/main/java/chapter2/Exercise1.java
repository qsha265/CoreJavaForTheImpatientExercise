package chapter2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/**
 * chapter2.Exercise1
 *
 * @author Quanyu Sha
 * @date 10/03/2020
 */
public class Exercise1 {

    /* Question
    Print the calendar which starts the week on a Sunday.
    Also print a new line at the end.
    */

    private static final int DAYS_OF_WEEK = 7;

    public static void printCalendar(int year, int month) {
        LocalDate date = LocalDate.of(year, month, 1);
        printDayOfWeekTitle();
        printDayOfMonth(date);
    }

    public static void printCalendar(int year, Month month) {
        LocalDate date = LocalDate.of(year, month, 1);
        printDayOfWeekTitle();
        printDayOfMonth(date);

    }

    public static void printDayOfWeekTitle() {
        // print day of week title from SUNDAY
        for (int i = 0; i < DAYS_OF_WEEK; i++) {
            if (i == 0) {
                System.out.printf("%.3s\t", DayOfWeek.of(7));
            } else if (i == 6) {
                System.out.printf("%.3s\n", DayOfWeek.of(i));
            } else {
                System.out.printf("%.3s\t", DayOfWeek.of(i));
            }
        }
    }

    public static void printDayOfMonth(LocalDate date) {
        Month month = date.getMonth();

        // skip the day of week for 1st day of the month
        for (int i = 0; i < date.getDayOfWeek().getValue(); i++) {
            if (date.getDayOfWeek().getValue() == 7) {
                break;
            } else {
                System.out.printf("%3s\t", " ");
            }
        }

        // print the day of the month
        for (int i = 1; i <= date.getMonth().length(true); i++) {
            if (date.getMonth() == month) {
                if (date.getDayOfWeek().getValue() == 6) {
                    System.out.printf("%3d\n", date.getDayOfMonth());
                    date = date.plusDays(1);
                } else {
                    System.out.printf("%3d\t", date.getDayOfMonth());
                    date = date.plusDays(1);
                }
            }
        }
        System.out.println();
    }
}
