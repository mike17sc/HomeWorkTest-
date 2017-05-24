package be.simac.homework;

/**
 * Created by Mschneider on 22-05-17.
 * Class convert any number to string
 */
public class Converter {
    /**
     * @param number take as parameter any number to be converted
     * @return the number into a string
     * @throws MyException if paramater isn't an number throw an exception
     */
    public static String numberToString(Number number) throws MyException {
        // Optimized code
        if (number != null) {
            return String.valueOf(number);
        } else {
            throw new MyException("Please enter a number");
        }
        // Mike code
        /*
        if (number == null) {
            return "";
        } else if (!(number instanceof Number)) {
            throw new MyException("Please enter a number");
        } else {
            return String.valueOf(number);
        }
        */
    }

}
