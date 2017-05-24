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
        try {
            String result = Converter.numberToString(null);
        } catch (MyException e) {
            assertThat(e).hasMessage("Please enter a number");
        }

    }

    /**
     * get error if trying to transform a null to string
     */
//    @Test
//    public void testNumberToStringNull() throws MyException {
//        String number = null;
//        String result = Converter.numberToString(number);
//        assertThat(result).isEqualTo("");
//    }
//
//    /**
//     * @throws MyException if trying to transform a not numeric parameter
//     */
//    @Test
//    public void testNumberToStringHashSet() throws MyException {
//        List<Integer> number = new ArrayList<>();
//        number.add(8);
//        number.add(5);
//        try {
//            String result = Converter.numberToString(number);
//        } catch (MyException e) {
//            assertThat(e).hasMessage("Please enter a number");
//        }
//    }
}
