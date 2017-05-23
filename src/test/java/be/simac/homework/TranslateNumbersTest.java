package be.simac.homework;

import java.util.*;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * Created by Mschneider on 23-05-17.
 */
public class TranslateNumbersTest {
    @Test
    public void translateNumbersTest() throws MyException{
        List<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(5);
        listNumbers.add(8);
        List<String> result = TranslateNumbers.translateNumbers(listNumbers);
        assertThat(result).hasSize(2);
        assertThat(result).contains("five","eight");

    }
    @Test
    public void translateNumbersNullTest() throws MyException{
        List<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(null);
        listNumbers.add(8);
        List<String>result= TranslateNumbers.translateNumbers(listNumbers);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
