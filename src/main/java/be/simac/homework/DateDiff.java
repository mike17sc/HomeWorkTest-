package be.simac.homework;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Created by Mschneider on 22-05-17.
 */
public class DateDiff {
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
