package be.simac.homework;

import java.util.*;

/**
 * Created by Mschneider on 23-05-17.
 */
public class TranslateNumbers {
    public static List translateNumbers(List<Integer> listNumbers) throws MyException {
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        List<String> convertedList = new ArrayList<>();
        for (int i = 0; i < listNumbers.size(); i++) {
            for (int j = 1; j < 11; j++) {
                try {
                    if (listNumbers.get(i) == j) {
                        convertedList.add(numbers[j]);
                    }
                } catch (NullPointerException e) {
                    throw new MyException("Can't insert null object into list");
                }
            }

        }
        return convertedList;
    }
}
