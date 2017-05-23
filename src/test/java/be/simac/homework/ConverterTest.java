package be.simac.homework;

import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by Mschneider on 22-05-17.
 */
public class ConverterTest {
    @Test
    public void testNumberToStringInt() throws MyException {
        int number = 5;
        String result = Converter.numberToString(number);
        assertThat(result).isEqualTo("5");
    }

    @Test
    public void testNumberToStringDouble() throws MyException {
        double number = 5.25;
        String result = Converter.numberToString(number);
        assertThat(result).isEqualTo("5.25");
    }

    @Test
    public void testNumberToStringFloat() throws MyException {
        float number = -5;
        String result = Converter.numberToString(number);
        assertThat(result).isEqualTo("-5.0");
    }

    @Test
    public void testNumberToStringString() throws MyException {
        String number = "Test";
        String result = Converter.numberToString(number);
        assertThat(result).isEqualTo("Test");
    }

    @Test
    public void testNumberToStringNull() throws MyException {
        String number = null;
        String result = Converter.numberToString(number);
        assertThat(result).isEqualTo("");
    }
    @Test
    public void testNumberToStringHashSet() throws MyException {
        List<Integer> number= new ArrayList<>();
        number.add(8);
        number.add(5);
        String result = Converter.numberToString(number);
        assertThat(result).isEqualTo("25");
    }
}
