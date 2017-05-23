package be.simac.homework;
import org.junit.Test;
import java.time.LocalDate;
import static org.assertj.core.api.Assertions.*;

/**
 * Created by Mschneider on 22-05-17.
 */
public class DateDiffTest {
    @Test
    public void testDateDiffEarlyDateFirst()throws MyException{
        LocalDate today= LocalDate.now();
        LocalDate yesterday=today.minusDays(1);
        long difference = DateDiff.dateDiff(yesterday,today);
        assertThat(difference).isEqualTo(1);
    }
    @Test
    public void testDateDiffEarlyDateScond()throws MyException{
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);
        long differnce = DateDiff.dateDiff(today,yesterday);
        assertThat(differnce).isEqualTo(1);
    }
    @Test
    public void testDateDiffNull()throws MyException{
        LocalDate today = null;
        LocalDate yesterday = LocalDate.now().minusDays(1);
        long differnce = DateDiff.dateDiff(today,yesterday);
        assertThat(differnce).isEqualTo(1);
    }
}
