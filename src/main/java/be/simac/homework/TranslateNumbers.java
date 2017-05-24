package be.simac.homework;

import java.util.*;

/**
 * Created by Mschneider on 23-05-17.
 */
public class TranslateNumbers {
    public static List translateNumbers(List<Integer> listNumbers) throws MyException {
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        List<String> convertedList = new ArrayList<>();
        if(listNumbers==null ||listNumbers.isEmpty()){
            throw new MyException("List musn't be null or empty");
        }
        boolean flag=false;
        for (int i = 0; i < listNumbers.size(); i++) {
            for (int j = 1; j < 11; j++) {
                try {
                    if (listNumbers.get(i) == j) {
                        convertedList.add(numbers[j]);
                        flag=true;
                    }
                } catch (NullPointerException e) {
                    throw new MyException("Can't insert null object into list");
                }
            }
            if(!flag){
                throw new MyException("Can only convert between 1-10");
            }

        }
        return convertedList;
    }
}
