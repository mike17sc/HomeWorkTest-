package be.simac.homework;
import org.junit.Test;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import static org.assertj.core.api.Assertions.*;
import java.time.LocalDate;

/**
 * Created by Mschneider on 22-05-17.
 */
public class DateDiffTest {
    @Test
    public void dateDiffTest(){
        LocalDate today= LocalDate.now();
        LocalDate yesterday=today.minusDays(1);
        long difference = DateDiff.dateDiff(yesterday,today);
        assertThat(difference).isEqualTo(1);
    }
}
