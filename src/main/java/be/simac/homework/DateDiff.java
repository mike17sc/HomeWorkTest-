package be.simac.homework;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
/**
 * Created by Mschneider on 22-05-17.
 */
public class DateDiff {
    public static long dateDiff(LocalDate beginDate, LocalDate endDate){
        long daysDiff=Duration.between(beginDate,endDate).toDays();
        return daysDiff;
    }
}
