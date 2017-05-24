package be.simac.homework;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Created by Mschneider on 22-05-17.
 */
public class DateDiff {
    /**
     *
     * @param beginDate enter a local date from begin
     * @param endDate enter a local date to end
     * @return a long who is the difference between the 2 dates
     * @throws MyException if one of the 2 dates are null throw an exception
     */
    public static long dateDiff(LocalDate beginDate, LocalDate endDate) throws MyException {
        try {
            long daysDiff = ChronoUnit.DAYS.between(beginDate, endDate);
            return Math.abs(daysDiff);
        }
        catch(NullPointerException e){
           throw new MyException("Parameter shouldn't be null");
        }

    }
}
