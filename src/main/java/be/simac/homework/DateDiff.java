package be.simac.homework;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/**
 * Created by Mschneider on 22-05-17.
 */
public class DateDiff {
    public static long dateDiff(LocalDate beginDate, LocalDate endDate){
        long daysDiff= ChronoUnit.DAYS.between(beginDate,endDate);
        return daysDiff;

    }
}
