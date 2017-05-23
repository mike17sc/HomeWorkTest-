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
        try{
            List<String>result= TranslateNumbers.translateNumbers(listNumbers);
        }
        catch(MyException e){
            assertThat(e).hasMessage("Can't insert null object into list");
        }

    }
    @Test
    public void translateNumbersNullListTest() throws MyException{
        List<Integer> listNumbers = null;
        try{
            List<String>result= TranslateNumbers.translateNumbers(listNumbers);
        }
        catch(MyException e){
            assertThat(e).hasMessage("List musn't be null or empty");
        }

    }
    @Test
    public void translateNumbersOutOfScopeTest() throws MyException{
        List<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(21);
        listNumbers.add(8);
        try{
            List<String>result= TranslateNumbers.translateNumbers(listNumbers);
        }
        catch(MyException e){
            assertThat(e).hasMessage("Can only convert between 1-10");
        }

    }
}
