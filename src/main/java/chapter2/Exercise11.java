package chapter2;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.time.LocalDate.*;
import static java.lang.System.*;

/**
 * chapter2.Exercise11
 *
 * <p>Question:
 * Rewrite the Cal class to use static imports for the System and LocalDate classes.</p>
 *
 * @author Quanyu Sha
 * @date 11/03/2020
 */
public class Exercise11 {

    public static class Cal {
        private static LocalDate date;
        private static DayOfWeek weekday;

        public static void main(String[] args) {
            date = now().withDayOfMonth(1);
            int month;
            if (args.length >= 2) {
                month = Integer.parseInt(args[0]);
                int year = Integer.parseInt(args[1]);
                date = of(year, month, 1);
            } else {
                month = date.getMonthValue();
            }

            System.out.println(" Mon Tue Wed Thu Fri Sat Sun");
            weekday = date.getDayOfWeek();
            int value = weekday.getValue(); // 1 = Monday, ... 7 = Sunday
            for (int i = 1; i < value; i++) {
                out.print("    ");
            }
            while (date.getMonthValue() == month) {
                out.printf("%4d", date.getDayOfMonth());
                date = date.plusDays(1);
                if (date.getDayOfWeek().getValue() == 1) {
                    out.println();
                }
            }
            if (date.getDayOfWeek().getValue() != 1) {
                out.println();
            }
        }
    }
}
