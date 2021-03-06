package be.simac.homework;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Created by Mschneider on 22-05-17.
 * Class to get days between 2 dates
 */
 class DateDiff {
    /**
     * @param beginDate enter a local date from begin
     * @param endDate   enter a local date to end
     * @return a long who is the difference between the 2 dates
     * @throws MyException if one of the 2 dates are null throw an exception
     */
    public static long dateDiff(LocalDate beginDate, LocalDate endDate) throws MyException {
        if(beginDate != null && endDate != null){
            long daysDiff = ChronoUnit.DAYS.between(beginDate, endDate);
            return Math.abs(daysDiff);
        } else {
            throw new MyException("Parameter shouldn't be null");
        }
    }
}
